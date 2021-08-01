package ru.gb.preparing_for_interview.lession_1.task_3;

public class Square extends Shape{

    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован квадрат");
    }

    @Override
    public void erase() {
        System.out.println("Квадрат стерт");
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
}
