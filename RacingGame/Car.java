package RacingGame;

import java.util.Random;

public class Car {
    String name;
    int speed;
    int score = 0;

    long seed = System.currentTimeMillis();
    Random random = new Random(seed);

    Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void setScore(int score) {
        this.score = score;
    }

    int getSpeed() {
        return speed;
    }

    int getScore() {
        return score;
    }

    void sayScore() {
        System.out.println("score: " + score);
    }

    void printInfo() {
        System.out.println("스피드는 " + speed + "이고, 이름은 " + name + "입니다.");
    }

    void go() {
        if (random.nextInt(2) == 1) {
            score += speed;
        }
    }
}
