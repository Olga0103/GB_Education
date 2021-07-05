package ru.gb.examples_of_patterns.iterator;

import java.util.Arrays;
import java.util.List;

public class ConcreteIterator implements Iterator<User> {
    private List<User> userList;
    private int index;

    public ConcreteIterator(List<User> userList) {
        this.userList = userList;
    }

    public ConcreteIterator(User[] users) {
        this.userList = Arrays.asList(users);
    }

    @Override
    public boolean hasNext() {
        return index < userList.size();
    }

    @Override
    public User next() {
        return userList.get(index++);
    }
}