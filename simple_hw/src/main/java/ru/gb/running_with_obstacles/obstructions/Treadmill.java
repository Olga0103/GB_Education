package ru.gb.running_with_obstacles.obstructions;

import ru.gb.running_with_obstacles.Assertions;
import ru.gb.running_with_obstacles.models.Participant;

public class Treadmill implements Obstacle {

    public int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public String check(Participant participant) {
        participant.run();
        participant.setMission(participant.getMaxRunning() >= length);
        if (participant.getMission()) {
            Assertions.assertTrue(participant.getMission());
            System.out.println(participant.getName() + " проходит дистанцию длиной: " + length + " м");
            return participant.getName() + " проходит дистанцию длиной: " + length + " м";
        } else {
            Assertions.assertFalse(participant.getMission());
            System.out.println(participant.getName() + " не проходит дистанцию длиной: " + length + " м");
            return participant.getName() + " не проходит дистанцию длиной: " + length + " м";
        }
    }

}