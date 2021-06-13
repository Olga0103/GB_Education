package ru.gb.hungry_cats;

public class Cat{

    public String name;
    public int satietyLimit;
    public boolean satiety;

    public Cat(String name, int satietyLimit, boolean satiety){
        this.name = name;
        this.satietyLimit = satietyLimit;
        this.satiety = satiety;
    }

    public void eat(Plate plate){
        plate.decreaseFood(satietyLimit);
    }

}