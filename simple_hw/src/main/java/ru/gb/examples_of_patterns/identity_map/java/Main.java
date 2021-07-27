package ru.gb.examples_of_patterns.identity_map.java;

public class Main {

    public static void main(String[] args) {

        UserMapper.createTable();
        UserMapper.addUser(new User(1,"2",3));
        UserMapper.findById(1L);
        UserMapper.findById(1L);
        UserMapper.deleteById(121L);
    }
}