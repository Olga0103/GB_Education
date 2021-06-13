package ru.gb.running_with_obstacles.obstructions;

import ru.gb.running_with_obstacles.models.Participant;

public interface Obstacle {

    String check(Participant participant);
}
