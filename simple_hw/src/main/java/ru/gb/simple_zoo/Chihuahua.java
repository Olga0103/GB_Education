package ru.gb.simple_zoo;

public class Chihuahua extends Dog {

    int maxDistance;

    Chihuahua(String name, String color, int runDistance, float jumpHeight, float swimDistance){
        super(name, color, runDistance, jumpHeight, swimDistance);
    }

    int getMaxDistance(){
        maxDistance = (int) (Math.random() * 100);
        return maxDistance;
    }

    @Override
    void run(){
        System.out.println(color + name + "сегодня смог пробежать " + getMaxDistance() + "м (и очень устал)");
    }

}
