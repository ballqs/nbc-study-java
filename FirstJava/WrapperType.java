package FirstJava;

public class WrapperType {
    public static void main(String[] args) {
        // 래퍼 클래스 변수
        // Wrapper Class라는 말 그대로 기본형 변수를 클래스로 한번 랩핑하는 변수
        int number = 21;

        // boxing
        Integer number2 = new Integer(number);  // deprecated : 현재는 이 표현은 사용하지 않는 표현이다.
        Integer number3 = number;               // 요즘은 이렇게 사용 가능
        System.out.println(number);
        System.out.println(number2.intValue()); // unboxing
        System.out.println(number3);            // intValue를 쓰지 않아도 출력되는 이유?


    }
}
