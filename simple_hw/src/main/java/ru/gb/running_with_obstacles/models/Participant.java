package ru.gb.running_with_obstacles.models;

public interface Participant {

    String getName();
    float getMaxRunning();
    float getMaxJumping();
    boolean getMission();
    void setMission(boolean b);
    void run();
    void jump();
}
