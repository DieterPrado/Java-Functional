package com.platzi.functional._11_composition;

import java.util.function.Function;

public class MathOperations2 {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy3 = x -> x * 3;

        Function<Integer, Integer> addOneMultiply3 =
                multiplyBy3.compose(y -> {
                    System.out.println("Le agregare 1 a " + y);
                    return y + 1;
                });
        //System.out.println(
          //      addOneMultiply3.apply(5)
        //);

        Function<Integer, Integer> andSquare =
                addOneMultiply3.andThen(x -> {
                    System.out.println("Estoy elevando al cuadrado");
                    return x * x;
                });
        System.out.println(andSquare.apply(5));

    }
}
