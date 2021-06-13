package ru.gb.simple_zoo;

public class Cat extends Animals{

    Cat(String name, String color, int runDistance, float jumpHeight, float swimDistance){
        super(name, color, runDistance, jumpHeight, swimDistance);
    }

    @Override
    void swim(){
        System.out.println(color + name + "не умеет плавать");
    }

}