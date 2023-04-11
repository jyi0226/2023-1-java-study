package JAVAstudy.hw;

import java.util.Scanner;

public class Racing_game{

    public static class Car{
        String name;
        int speed;

        Car(String name, int speed){
            this.name=name;
            this.speed=speed;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차의 갯수를 입력하세요.");
        int n = scanner.nextInt();

        Car[] cars = new Car[n];

        for(int i=0;i<n;i++){
            scanner.nextLine();
            System.out.println((i+1)+"번 째 자동차의 이름을 입력하세요.");
            String name = scanner.nextLine();
            System.out.println((i+1)+"번 째 자동차의 속도를 입력하세요.");
            int speed = scanner.nextInt();

            cars[i] = new Car(name,speed);
        }

        System.out.println("\n-----경기 참가자 소개-----");
        for(int i=0;i<n;i++){
            System.out.println((i+1)+"번 참가자: 이름은 "+cars[i].name+"이고, 스피드는 "+cars[i].speed+"입니다.");
        }
    }
}
