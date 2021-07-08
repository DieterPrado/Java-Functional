package com.platzi.functional._06_reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NameUtils {
    public static void main(String[] args) {
        List<String> professor = getList("Nicolas", "Juan", "Zulema");

        Consumer<String> printer = text -> System.out.println(text);
        professor.forEach(printer);
    }
    public static <T> List<T> getList(T ... elements){
        return Arrays.asList(elements);
    }
}
