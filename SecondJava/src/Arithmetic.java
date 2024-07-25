package SecondJava;
public class Arithmetic {
    public static void main(String[] args) {
        // 기본적인 사칙연산

        // 덧셈
        System.out.println(2 + 2);

        // 뺄셈
        System.out.println(2 - 2);

        // 곱셈
        System.out.println(2 * 2);

        // 나눗셈
        System.out.println(2 / 2);

        // 나머지
        System.out.println(2 % 2);

        // 우선순위 정하기 소괄호 이용
        System.out.println(2 + 2 * 2);      // 6
        System.out.println((2 + 2) * 2);    // 8
    }
}