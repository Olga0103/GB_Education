package ru.gb.examples_of_patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
    private List<User> list = new ArrayList<>();

    public ConcreteAggregate() {
        list.add(new User("noname0", 20));
        list.add(new User("noname1", 21));
        list.add(new User("noname2", 22));
        list.add(new User("noname3", 23));
    }

    @Override
    public Iterator<User> iterator() {
        return new ConcreteIterator(list);
    }
}