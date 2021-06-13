package ru.gb.simple.zoo;

public class Sphinx extends Cat{

    int maxJump;

    Sphinx(String name, String color, int runDistance, float jumpHeight, float swimDistance){
        super(name, color, runDistance, jumpHeight, swimDistance);
    }


    float getMaxJump(){
        maxJump = (int) (Math.random() * 2.5f);
        return maxJump;
    }

    @Override
    void jump(){
        System.out.println(color + name + "сегодня смогла подпрыгнуть на " + getMaxJump() + "м");
    }

}
