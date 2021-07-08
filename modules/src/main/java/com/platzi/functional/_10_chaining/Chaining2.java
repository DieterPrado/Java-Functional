package com.platzi.functional._10_chaining;

public class Chaining2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hola")
                .append("A quien lea esto")
                .append(", me llamo dieter");

        Chainer chainer = new Chainer();
        chainer.sayHi().sayBye();


    }

    static class Chainer {
        public Chainer sayHi(){
            System.out.printf("Hola");
            return this;
        }
        public Chainer sayBye(){
            System.out.printf("Bye");
            return this;
        }
    }
}
