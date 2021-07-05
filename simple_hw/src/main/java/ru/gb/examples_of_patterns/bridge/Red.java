package ru.gb.examples_of_patterns.bridge;

public class Red implements Color{
    public void bePaint(String penType,String name){
        System.out.println(penType+"Red"+name+".");
    }
}