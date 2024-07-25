// 클래스
// 접근제어자
//      public : 언제 어디서나 접근 가능
//      private : 같은 클래스 내에서만 접근 가능
//      protected : 같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근 가능
//      default : 같은 패키지 내에서만 접근 가능
public class Main {

    // [JDK]
    // (1) compiler : .java -> .class
    // (2) JRE
    // (3) JDB : 디버깅

    // () : 소괄호
    // {} : 중괄호
    // [] : 대괄호

    // main 메소드
    // 자바 프로젝트(앱)는, 제일 먼저 클래스의 main 메소드를 실행시킨다.
    // = JVM의 약속
    // static : 이 프로그램이 시작될때 무조건 실행되는 녀석임을 표현

    // void : 메서드의 출력값의 데이터 타입
    // 데이터 타입이 아닌 void의 경우는 return 값이 없다는 것을 의미

    // String[] args : 받아오는 매개 변수 자리
    //                 꼭 변수명이 args 일 필요는 없다.
    public static void main(String[] args) {
        // 객체 : 특징(속성 , 변수), 행동(메소드)
        // System 안에 out이라는 객체가 있고 그 안에 println 라는 메소드를 포함하고 있다.
        // 그리고 소괄호 안에 입력된 값을 받아 실행하고 있다!

        // println -> 줄 바꿈 O
        // ln -> line 이라는 뜻
        System.out.println("Test12312");

        // print -> 줄 바꿈은 하지 X
        System.out.print("Test12312");

        // 숫자로 출력하는 경우는 문제없지만
        // 문자로 출력하는 경우는 "" 안에 작성해야한다.
        System.out.println("Test12312");
    }

    // 이와 같이 String이라고 해야지 return 값이 String 이라는 것!!
    public String Test() {
        return "";
    }
}
