package ru.gb.preparing_for_interview.lession_2.linkedlist;

public class TestLinkedList {

    public static void main(String[] args) {

        MyLinkedListImpl<String> test = new MyLinkedListImpl<>();
        test.insertFirst("C");
        test.insertFirst("B");
        test.insertFirst("A");
        test.print();
        test.insertLast("D");
        test.insertLast("E");
        test.removeFirst();
        test.remove("C");
        System.out.println(test.contains("B"));
        System.out.println(test.contains("C"));
        System.out.println(test.size());
        test.removeLast();
        test.removeLast();
        test.removeLast();
        System.out.println(test.size());
        test.print();
        test.insertLast("GG");
        test.print();
    }
}