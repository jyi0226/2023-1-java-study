package JAVAstudy.hw;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Racing_game {

    public static class Car {
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

        void sayScore(){
            System.out.println("score: "+score);
        }
        void printInfo() {
            System.out.println("스피드는 " + speed+"이고, 이름은 "+name+"입니다.");
        }

        void go() {
            if (random.nextInt(2) == 1) {
                score += speed;
            }
        }
    }
    static class SuperCar extends Car{
        SuperCar(String name,int speed){
            super(name,speed);
        }
        int boost=0;
        void go(){
            if (random.nextInt(2) == 1) {
                score += speed;
                if (random.nextInt(2) == 1) {
                    score += speed;
                    boost+=1;
                }
            }
        }
        void sayScore(){
            System.out.println("score: "+score+", booster: "+boost);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차의 갯수를 입력하세요.");
        int n = scanner.nextInt();

        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            System.out.println((i + 1) + "번 째 자동차의 스피드를 입력하세요.");
            int speed = scanner.nextInt();
            scanner.nextLine();
            System.out.println((i + 1) + "번 째 자동차의 이름을 입력하세요.");
            String name = scanner.nextLine();
            System.out.println("이 자동차는 슈퍼카인가요? 0 또는 1 입력");
            int sup= scanner.nextInt();
            if(sup==1){
                SuperCar car = new SuperCar(name,speed);
                cars.add(i,car);
            }
            else{
                Car car = new Car(name, speed);
                cars.add(i, car);
            }
        }
        System.out.println("\n-----경기 참가자 소개-----");
        for (int i = 0; i < n; i++) {
            cars.get(i).printInfo();
        }

        System.out.println("\n경기를 몇 초 동안 진행할까요?");
        int time = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < time; j++) {
                cars.get(i).go();
            }
        }
        System.out.println("\n---최종 결과 발표---");
        for (Car car : cars) {
            car.sayScore();
        }
    }
}
