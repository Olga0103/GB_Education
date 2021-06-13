package ru.gb.running_with_obstacles.models;

public class Robot implements Participant {

    String name;
    float maxRunning;
    float maxJumping;
    boolean mission = true;


    public Robot(String name, float maxRunning) {
        this.name = name;
        this.maxRunning = maxRunning;
    }

    public void run() {
        System.out.println(name + " может пробежать максимум " + maxRunning + "м");
    }

    public void jump() {
        System.out.println(name + " не умеет прыгать!");
    }

    public String getName() {
        return name;
    }

    public float getMaxRunning() {
        return maxRunning;
    }

    public float getMaxJumping() {
        return maxJumping;
    }

    public boolean getMission() {
        return mission;
    }

    @Override
    public void setMission(boolean mission) {
        this.mission = mission;
    }

}