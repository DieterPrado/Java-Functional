package com.platzi.functional._07_inference;

import com.platzi.functional._06_reference_operator.NameUtils;

import java.util.List;
import java.util.function.Function;

public class Inferencia {
    public static void main(String[] args) {
        Function<Integer, String> funcionConvertidore =
                integer -> "Al doble: " + (integer*2);

        List<String> alumnos = NameUtils.getList("Hugo", "Paco", "Dieter");

        alumnos.forEach(name -> System.out.println(name));
    }

}
