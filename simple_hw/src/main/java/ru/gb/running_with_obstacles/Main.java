package ru.gb.running_with_obstacles;

import ru.gb.running_with_obstacles.models.Cat;
import ru.gb.running_with_obstacles.models.Human;
import ru.gb.running_with_obstacles.models.Participant;
import ru.gb.running_with_obstacles.models.Robot;
import ru.gb.running_with_obstacles.obstructions.Obstacle;
import ru.gb.running_with_obstacles.obstructions.Treadmill;
import ru.gb.running_with_obstacles.obstructions.Wall;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Клёпа", 150, 1.5f);
        Human human = new Human("Электроник", 1000, 0.75f);
        Robot robot = new Robot("Вертер", 2000);

        Participant[] participants = {cat, human, robot};

        Treadmill treadmill = new Treadmill(149);
        Wall wall = new Wall(0.74f);
        Treadmill treadmill1 = new Treadmill(500);
        Wall wall1 = new Wall(0.3f);
        Treadmill treadmill2 = new Treadmill(1001);

        Obstacle[] obstacles = {wall, treadmill, wall1, treadmill1, treadmill2};

        for(int i =0; i < obstacles.length; i++) {
            for(Participant participant: participants) {
                if(participant.getMission()) {
                    obstacles[i].check(participant);
                }
            }
        }
    }

}
