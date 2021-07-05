package ru.gb.examples_of_patterns.bridge;

public abstract class Pen {
    protected  Color color;
    public void setColor(Color color){
        this.color=color;
    }
    public abstract void draw(String name);
}