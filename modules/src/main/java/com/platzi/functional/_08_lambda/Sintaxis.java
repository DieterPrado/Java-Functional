package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NameUtils;

import java.util.List;
import java.util.function.BiFunction;

public class Sintaxis {
    public static void main(String[] args) {
        List<String> cursos = NameUtils.getList("Java", "Funcional");
        cursos.forEach(curso -> System.out.println(curso));


    }

    @FunctionalInterface
    interface zeroArguments {
        int get();
    }
}
