package ru.gb.preparing_for_interview.lession_2.arraylist;

public interface MyArrayList<E> {
    void add(E object);

    E get(int index);

    int indexOf(E object);

    void remove(int index);
}