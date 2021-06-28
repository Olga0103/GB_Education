package ru.gb.examples_of_patterns.singleton;

public class App {

    public static void main(String[] args) {
        SingletonExample singletonExample1 = SingletonExample.getINSTANCE();
        SingletonExample singletonExample2 = SingletonExample.getINSTANCE();

        System.out.println(singletonExample1.hashCode());
        System.out.println(singletonExample2.hashCode());
        System.out.println(singletonExample1.hashCode() == singletonExample2.hashCode());

    }
}