package ThirdJava;

import ThirdJava.Door;
import ThirdJava.Tire;
import ThirdJava.Handle;

// [우리가 클래스를 만들기 위해서는 4가지 STEP이 필요합니다]
// 1. 만들려고 하는 설계도는 선언합니다.(클래스 선언)
// 2. 객체가 가지고 있어야할 속성(필드)을 정의합니다.
// 3. 객체를 생성하는 방식을 정의합니다.(생성자)
// 4. 객체가 가지고 있어야할 행위(메서드)를 정의합니다.

public class Car {
    // 필드 영역

    // 1) 고유 데이터 영역
    String company;     // 자동차 회사
    String model;       // 자동차 모델
    String color;       // 자동차 색
    double price;       // 자동차 가격
    // 2) 상태 데이터 영역
    double speed;       // 자동차 속도, km/h
    char gear = 'P';          // 자동차 기어(P, R, N, D)
    boolean lights;     // 자동차 조명
    // 3) 객체 데이터 영역
    Door door = new Door();
    Tire tire = new Tire();
    Handle handle = new Handle();

    // 생성자 : 처음 객체가 생성될 때(instance화) 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의!
    public Car() {
        System.out.println("생성자가 호출되었습니다! 객체가 생성됩니다.");
    }

    // 메소드 영역
    // 가속
    public double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    // 브레이크
    public double brakePedal() {
        speed = 0;
        return speed;
    }

    // 기어 변경
    public char changeGear(char type) {
        gear = type;
        return gear;
    }

    // 조명 On/Off
    public boolean onOffLight() {
        lights = !lights;
        return lights;
    }

    // 경적
    public void horn() {
        System.out.println("빠아아앙~");
    }

    // 가변길이 메서드
    public void carSpeed(double ...speed) {
        for (double v : speed) {
            System.out.println("v = " + v);
        }
    }
}