package RacingGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private ArrayList<Car> cars;
    private Scanner scanner;

    public Game(){
        cars = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    public void startGame() {
        int carCount = getCarCount();
        createCars(carCount);
        introduceCars();
        int raceTime = getRaceTime();
        runRace(raceTime);
        announceResult();
    }
    private int getCarCount(){
        System.out.println("자동차의 갯수를 입력하세요.");
        return scanner.nextInt();
    }

    private void createCars(int carCount){
        for (int i = 0; i < carCount; i++) {
            scanner.nextLine();
            System.out.println((i + 1) + "번 째 자동차의 스피드를 입력하세요.");
            int speed = scanner.nextInt();
            scanner.nextLine();
            System.out.println((i + 1) + "번 째 자동차의 이름을 입력하세요.");
            String name = scanner.nextLine();
            System.out.println("이 자동차는 슈퍼카인가요? 0 또는 1 입력");
            int sup = scanner.nextInt();
            if (sup == 1) {
                SuperCar car = new SuperCar(name, speed);
                cars.add(car);
            } else {
                Car car = new Car(name, speed);
                cars.add(car);
            }
        }
    }
    private void introduceCars(){
        System.out.println("\n-----경기 참가자 소개-----");
        for (Car car : cars) {
            car.printInfo();
        }
    }
    private int getRaceTime(){
        System.out.println("경기를 몇 초 동안 진행할까요?");
        return scanner.nextInt();
    }
    private void runRace(int raceTime){
        for(Car car : cars) {
            for (int i = 0; i < raceTime; i++) {
                car.go();
            }
        }
    }
    private void announceResult(){
        System.out.println("\n---최종 결과 발표---");
        for(Car car : cars){
            car.sayScore();
        }
    }
}
