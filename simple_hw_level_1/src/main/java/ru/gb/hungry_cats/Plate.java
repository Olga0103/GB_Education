package ru.gb.hungry_cats;

public class Plate{

    public int food;

    public Plate(int food){
        this.food = food;
    }

    public void decreaseFood(int val){
        this.food -= val;
    }

    public void increaseFood(int n){
        food += n;
    }

    public void info(){
        System.out.println("В тарелке " + food + " единиц корма");
    }

}
