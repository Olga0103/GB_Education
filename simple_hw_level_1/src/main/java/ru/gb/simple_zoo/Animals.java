package ru.gb.simple_zoo;

public abstract class Animals {

    protected String name;
    protected String color;
    protected int runDistance;
    protected float jumpHeight;
    protected float swimDistance;

    Animals(String name, String color, int runDistance, float jumpHeight, float swimDistance){
        this.name = name;
        this.color = color;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
    }

    void run(){
        System.out.println(color + name + "пробежал/ла " + runDistance + "м");
    }

    void jump(){
        System.out.println(color + name + "подпрыгнул/ла на " + jumpHeight + "м");
    }

    void swim(){
        System.out.println(color + name + "проплыл " + swimDistance + "м");
    }

}
