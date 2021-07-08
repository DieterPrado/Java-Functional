package com.platzi.functional._12_currying;

import java.util.*;

public class Optionals {
    public static void main(String[] args) {
        List<String> names = getNames();
        if (names != null){
            //Operar con nombres.
        }

        Optional<List<String >> optionalNames  = getOptionalNames();
        if(optionalNames.isPresent()){

        }

        optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));
    }
    static List<String> getNames(){
        List<String> list = new LinkedList<>();

        return Collections.emptyList();
    }

    static String mostValuablePlayer(){
        return null;
    }



    static Optional<List<String>> getOptionalNames(){
        List<String> nameList = new LinkedList<>();
        //obtencion de nombres
        return Optional.of(nameList);
    }

   // static Optional<String> optionalValuablePlayer(){
        //return Optional.ofNullable()
    //}

}
