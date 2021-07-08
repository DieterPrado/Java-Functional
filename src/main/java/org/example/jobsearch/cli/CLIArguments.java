package org.example.jobsearch.cli;

import com.beust.jcommander.Parameter;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.function.Function;

public class CLIArguments {

    
    CLIArguments(){

    }

    @Parameter(
            required = true,
            descriptionKey = "KEYWORD",
            validateWith = CLIKeywordValidator.class,
            description = "KEYWORD"
    )

    private String keyword;

    @Parameter(
            names = {"--location", "-l"},
            description = "Cada busqueda puede incluir una ubicacion"
    )
    private String location;

    @Parameter(
            names = {"--page", "-p"},
            description = "La API devuelve 50 resultados, usa un numero para la pagina"
    )
    private int page = 0;

    @Parameter(
            names = {"--full time"},
            description = "Agregar si queremos trabajos de tiempo completo"
    )
    private boolean isFullTime = false;

    @Parameter(
            names = {"--markdown"},
            description = "obtener los resultados en markdown"
    )
    private boolean isMarkDown = false;

    @Parameter(
            names = {"--help"},
            help = true,
            validateWith = CLIHelpValidator.class,
            description = "mostrar la ayuda"
    )
    private boolean isHelp;

    public String getKeyword() {
        return keyword;
    }

    public String getLocation() {
        return location;
    }

    public int getPage() {
        return page;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public boolean isMarkDown() {
        return isMarkDown;
    }

    public boolean isHelp() {
        return isHelp;
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "keyword='" + keyword + '\'' +
                ", location='" + location + '\'' +
                ", page=" + page +
                ", isFullTime=" + isFullTime +
                ", isMarkDown=" + isMarkDown +
                ", isHelp=" + isHelp +
                '}';
    }

    public static CLIArguments newInstance(){
        return new CLIArguments();
    }
}
