package packageExample.main;

// import 방법
import packageExample.pk1.Car;

public class Main {
    public static void main(String[] args) {
        // 클래스의 일부분이며, 하위 패키지를 도트(.)로 구분한다.
//        packageExample.pk1.Car car1 = new packageExample.pk1.Car();
//        packageExample.pk2.Car car2 = new packageExample.pk2.Car();
//
//        car1.horn();
//        car2.horn();

        //불러올 import의 class명이 같으면은 사용에 지장이 생긴다.
        Car car1 = new Car();
        packageExample.pk2.Car car2 = new packageExample.pk2.Car();
        car1.horn();
        car2.horn();
    }
}
