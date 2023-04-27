import java.util.ArrayList;
import java.util.Scanner;

public class Racing_game {

    public static class Car {
        String name;
        int speed;

        Car(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        void printInfo(){
            System.out.println("자동차의 이름은 " + name + ", 자동차의 속도는 " + speed);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
            cars.add(i,car);
        }
        System.out.println("\n-----경기 참가자 소개-----");
        for (int i = 0; i < n; i++) {
            cars.get(i).printInfo();
        }
    }
}

