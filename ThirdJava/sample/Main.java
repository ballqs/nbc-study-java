package sample;

public class Main {
    // [전역변수]
    static int number2 = 1;

    // [상수] => 카멜케이스로 작성
    static final String STR = "F";

    Main() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        // 기본 생성자가 내장되어 있기에 아래와 같이 선언 가능
        Main main = new Main();
        System.out.println(main.getNumber());
        System.out.println(main.getNumber());
    }

    // 메서드
    public int getNumber() {
        // [지역변수]
        // 해당 메서드가 실행될 때 마다 독립적인 값ㅇ르 저장하고 관리합니다.
        // 이 지역변수는 메서드 내부에서 정의될 때 생성된다.
        // 이 메서드가 종료될 때 소멸된다.
        int number = 1;
        number += 1;
        return number;
    }
}
