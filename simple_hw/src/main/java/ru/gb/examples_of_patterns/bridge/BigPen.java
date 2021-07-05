package ru.gb.examples_of_patterns.bridge;

public class BigPen extends Pen{
    @Override
    public void draw(String name) {
        String penType="Large brush drawing";
        this.color.bePaint(penType,name);
    }
}