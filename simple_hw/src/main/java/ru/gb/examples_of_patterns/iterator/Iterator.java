package ru.gb.examples_of_patterns.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}