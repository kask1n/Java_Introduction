package Java_Seminar8_CW.Sample2;

import java.nio.channels.spi.AbstractSelectionKey;

public class Championship {
    public static void main(String[] args) {
        Obstacle[] obstacles = {  // Полоса препятствий.
                new Track(1200),
                new Wall(30),
                new Track(2000),
                new Wall(140),
                new Track(3000),
                new Wall(250)
        };

        Runner[] runners = {
                new Cat("Персик", 1500, 300),
                new Cat("Барсик", 1700, 220),
                new Robot("R2D2", 99999, 0),
                new Robot("C3PO", 5000, 50),
                new Human("Петя", 3200, 280),
                new Human("Вася", 2900, 120)
        };

        for (Runner runner :
                runners) {
            for (Obstacle obstacle :
                    obstacles) {
                if (obstacle instanceof Track) {
                    if (!runner.run(obstacle.getLength()))
                        break;
                } else if (obstacle instanceof Wall) {
                    if (!runner.jump(obstacle.getHeight()))
                        break;
                }
            }
        }
    }
}
