package org.example.jobsearch;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class CommanderFunctions {
    static <T> JCommander buildCommanderWithName(String cliname, Supplier<T> argumentSupplier){
        JCommander jCommander = JCommander.newBuilder()
                .addObject(argumentSupplier.get())
                .build();

        jCommander.setProgramName(cliname);
        return jCommander;
    }

    static Optional<List<Object>> parseArguments(
            JCommander jCommander,
            String[] arguments,
            Consumer<JCommander> onEror
    ){
        try {
            jCommander.parse(arguments);
            return Optional.of(jCommander.getObjects());
        }catch (ParameterException paramEx){
            onEror.accept(jCommander);
        }
        return Optional.empty();
    }
}
