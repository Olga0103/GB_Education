package ru.gb.running_with_obstacles.obstructions;

import ru.gb.running_with_obstacles.Assertions;
import ru.gb.running_with_obstacles.models.Participant;

public class Wall implements Obstacle {

    public float height;

    public Wall(float height) {
        this.height = height;
    }

    @Override
    public String check(Participant participant) {

        participant.jump();
        participant.setMission(participant.getMaxJumping() >= height);
        if (participant.getMission()) {
            Assertions.assertTrue(participant.getMission());
            System.out.println(participant.getName() + " перепрыгнул стену высотой: " + height + " м");
            return  participant.getName() + " перепрыгнул стену высотой: " + height + " м";
        } else {
            Assertions.assertFalse(participant.getMission());
            System.out.println(participant.getName() + " не перепрыгнул стену высотой: " + height + " м");
            return participant.getName() + " не перепрыгнул стену высотой: " + height + " м";
        }
    }

}
