public class BasicType {
    public static void main(String[] args) {
        // 상수 : 맨 앞에 final를 선언해둘 것
        final boolean b = true;
        // b = false; // 에러 발생! 상수라서 변경 불가능!

        // 논리형 변수 : boolean
        boolean flag = true;    // 논리형 변수 boolean 으로 선언 및 True 값으로 초기화
        flag = false;           // False 값으로도 저장할 수 있습니다.

        // 문자형 변수 : char
        // 문자 뒤에 \0(널문자)가 없습니다. 1byte만 쓰기 때문에 알아서 데이터만 저장하면 됩니다.
        char alphabet = 'A';    // 문자 하나만 저장합니다. "" 사용 불가 '' 만 사용 할것

        // 정수형 변수 : byte, short, int, long
        // 0,1,2,99와 같은 정수형 숫자값을 저장합니다.
        // 정수형 변수 표현 범위
        byte byteNumber = 127;          // byte 는 -128 ~ 127 범위의 숫자만 저장 가능합니다.
        short shortNumber = 32767;      // short 는 -32.768 ~ 32,767 범위의 숫자만 저장 가능합니다.
        int intNumber = 2147483647;     // int 는 -21억 ~ 21억 범위의 숫자만 저장 가능합니다.
        long longNumber = 2147483647L;  // long 은 숫자뒤에 알파벳 L을 붙여서 표기하며 매우 큰수를 저장 가능합니다.

        // 실수형 변수 : float, double
        // 0.123, 0.9999 와 같은 소수점 실수값을 저장합니다.
        // 실수는 표현범위가 매우 넓어서 정수형 변수에 담지 못할 수 있다.
        float floatNumber = 0.123f;     // float 는 4byte 로 3.4 * 10^38 범위를 표현하는 실수값
        double doubleNumber = 0.123;    // double 은 8byte 로 1.7 * 10^308 범위를 표현하는 실수값
    }
}
