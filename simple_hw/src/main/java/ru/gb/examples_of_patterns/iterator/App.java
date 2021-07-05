package ru.gb.examples_of_patterns.iterator;

public class App {
    public static void main(String[] args) {
        Iterator<User> iterator = new ConcreteAggregate().iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            System.out.println(next.toString());
        }
    }
}