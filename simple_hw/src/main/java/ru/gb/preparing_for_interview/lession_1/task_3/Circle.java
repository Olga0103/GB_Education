package ru.gb.preparing_for_interview.lession_1.task_3;

public class Circle extends Shape{

    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован круг");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Круг покрашен в " + color + " цвет");
    }
}
