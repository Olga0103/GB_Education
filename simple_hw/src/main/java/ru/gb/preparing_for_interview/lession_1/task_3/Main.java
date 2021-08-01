package ru.gb.preparing_for_interview.lession_1.task_3;

public class Main {
    public static void main(String[] args) {


        Circle circle = new Circle("red");
        Triangle triangle = new Triangle();
        Square square = new Square(30);

        circle.draw();
        circle.setColor("blue");
        triangle.erase();
        square.draw();


    }
}
