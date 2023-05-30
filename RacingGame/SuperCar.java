package RacingGame;

public class SuperCar extends Car {

    int boost = 0;

    SuperCar(String name, int speed) {
        super(name, speed);
    }

    void go() {
        if (random.nextInt(2) == 1) {
            score += speed;
            if (random.nextInt(2) == 1) {
                score += speed;
                boost += 1;
            }
        }
    }

    void sayScore() {
        System.out.println("score: " + score + ", booster: " + boost);
    }
}
