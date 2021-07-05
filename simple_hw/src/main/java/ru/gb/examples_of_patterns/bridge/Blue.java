package ru.gb.examples_of_patterns.bridge;

public class Blue implements Color{
    public void bePaint(String penType,String name){
        System.out.println(penType+"Blue"+name+".");
    }
}