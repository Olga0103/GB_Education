package ru.gb.examples_of_patterns.bridge;

public class SmallPen extends Pen{
    @Override
    public void draw(String name) {
        String penType="Small brush drawing";
        this.color.bePaint(penType,name);
    }
}