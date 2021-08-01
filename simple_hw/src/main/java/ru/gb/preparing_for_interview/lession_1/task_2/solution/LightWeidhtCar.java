package ru.gb.preparing_for_interview.lession_1.task_2.solution;

class LightWeightCar extends Car{

    @Override
    void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {

    }
}
