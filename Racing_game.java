
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Racing_game {

    public static class Car {
        String name;
        int speed;
        int score;

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

        void printInfo() {
            System.out.println("자동차의 이름은 " + name + ", 자동차의 속도는 " + speed);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long seed = System.currentTimeMillis();
        Random random = new Random(seed);

        System.out.println("자동차의 갯수를 입력하세요.");
        int n = scanner.nextInt();

        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            System.out.println((i + 1) + "번 째 자동차의 이름을 입력하세요.");
            String name = scanner.nextLine();
            System.out.println((i + 1) + "번 째 자동차의 속도를 입력하세요.");
            int speed = scanner.nextInt();

            Car car = new Car(name, speed);
            cars.add(i, car);
        }
        System.out.println("\n-----경기 참가자 소개-----");
        for (int i = 0; i < n; i++) {
            cars.get(i).printInfo();
        }

        System.out.println("\n경기를 몇 초 동안 진행할까요?");
        int time = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int score = 0;
            int cur_speed = cars.get(i).getSpeed();
            for (int j = 0; j < time; j++) {
                if (random.nextInt(2) == 1)
                    score += cur_speed;
            }
            cars.get(i).setScore(score);
        }

        System.out.println("\n---최종 결과 발표---");
        for (int i = 0; i < n; i++) {
            System.out.println(cars.get(i).getScore());
        }
    }
}

