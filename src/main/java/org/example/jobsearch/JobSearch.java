package org.example.jobsearch;

import com.beust.jcommander.JCommander;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.example.jobsearch.api.ApiJobs;
import org.example.jobsearch.cli.CLIArguments;
import org.example.jobsearch.cli.CLIFunctions;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static org.example.jobsearch.CommanderFunctions.buildCommanderWithName;
import static org.example.jobsearch.CommanderFunctions.parseArguments;
import static org.example.jobsearch.api.APIFunctions.buildAPI;

public class JobSearch {
    public static void main(String[] args) {
        JCommander jCommander = buildCommanderWithName ("job-search", CLIArguments::newInstance);

        Stream<CLIArguments> streamOfCLI =
                parseArguments(jCommander, args, JCommander::usage)
                .orElse(Collections.emptyList())
                .stream()
                .map(obj -> (CLIArguments) obj);

        Optional<CLIArguments> cliArgumentsOptional =
                streamOfCLI.filter(cli -> !cli.isHelp())
                .filter(cli -> cli.getKeyword() != null)
                .findFirst();

        cliArgumentsOptional.map(CLIFunctions::toMap)
                .map(JobSearch::executeRequest)
                .orElse(Stream.empty())
                .forEach(System.out::println);

    }

    private static Stream<JobPosition> executeRequest(Map<String, Object> params){
        ApiJobs api = buildAPI(ApiJobs.class, "https://jobs.github.com/api");

        return Stream.of(params)
                .map(api::jobs)
                .flatMap(Collection::stream);

    }


}
