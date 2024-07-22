package FirstJava;

public class ConvertType {
    public static void main(String[] args) {
        // 강제 형 변환 예제 : 변수의 타입을 바꾸는 방법
        // 더 작은 표현 범위를 가진 타입으로 값의 손실이 생길 수도 있다.

        // double형 or float형 -> int
        // 실수 -> 정수(0.xxxx -> 0)
        double doubleNumber = 10.101010;
        float floatNumber = 10.1010f;

        // 변환(double -> int)
        int intNumber = (int) doubleNumber;
        System.out.println("double : " + doubleNumber);
        System.out.println("int : " + intNumber);

        // 변환(float -> int)
        int intNumber2 = (int) floatNumber;
        System.out.println("float : " + floatNumber);
        System.out.println("int : " + intNumber2);


        // int형 -> double형 or float형
        // 정수 -> 실수
        double doubleNumber2 = (double) intNumber;
        float floatNumber2 = (float) intNumber2;
        
        System.out.println("double : " + doubleNumber2);
        System.out.println("float : " + floatNumber2);

        // 자동 형변환
        // 더 큰 표현범위를 가진 타입으로 변환되는것이라 값의 손실이 없다.
        // 변수 타입별 크기 순서
        // byte(1) -> short(20) -> int(4) -> long(8) -> float(4) -> double(8) 순서로 저장될때 자동으로 형변환이 일어남

        // (1) byte -> int
        byte byteNumber = 10;
        int intNumber3 = byteNumber;
        System.out.println(intNumber3);

        // (2) char(1 byte) -> int(4) 형변환
        char charAlphabet = 'A';
        int intNumber4 = charAlphabet;
        System.out.println(intNumber4);

        // (3) int -> long number 형변환
        int intNumber5 = 100;
        long longNumber = intNumber5;
        System.out.println(longNumber);

        // (4) int -> double 형 변환
        int intNumber6 = 200;
        double doubleNumber3 = intNumber6;
        System.out.println(doubleNumber3);

        // 작은 크기의 타입이 큰 크기의 타입과 '계산'될 때,
        // 자동으로 큰 크기의 타입으로 형 변환이 됩니다.
        int intNumber7 = 10;
        double doubleNumber4 = 5.5;
        System.out.println(intNumber7 + doubleNumber4); // 15.5가 출력
    }
}
