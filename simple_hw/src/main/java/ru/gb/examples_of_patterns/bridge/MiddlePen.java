package ru.gb.examples_of_patterns.bridge;

public class MiddlePen extends Pen{
    @Override
    public void draw(String name) {
        String penType="Medium brush drawing";
        this.color.bePaint(penType,name);
    }
}