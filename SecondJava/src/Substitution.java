package SecondJava;

public class Substitution {
    public static void main(String[] args) {
        // 대입 연산자
        // 변수를 바로 연산해서 그 자리에서 저장하는 (대입하는) 연산자

        // =(기본연산자)
        int number = 10;
        number = number + 2;
        System.out.println(number);

        number = number - 2;
        System.out.println(number);

        number = number * 2;
        System.out.println(number);

        number = number / 2;
        System.out.println(number);

        number = number % 2;
        System.out.println(number);

        System.out.println("=================");

        // += , -= , /= , *=(복합대입연산자)
        number += 2;    // number = number + 2;
        System.out.println(number);

        number -= 2;    // number = number - 2;
        System.out.println(number);

        number *= 2;    // number = number * 2;
        System.out.println(number);

        number /= 2;    // number = number / 2;
        System.out.println(number);

        number %= 2;    // number = number % 2;
        System.out.println(number);

        // ++ , --
        number++;       // number += 1; 후증가  number(10)++ + 2 = 12 이후에 증가
        ++number;       // number += 1; 선증가  ++number(10) + 2 = 13

        number--;       // number -= 1; 후감소  number(10)-- + 2 = 12 이후에 감소
        --number;       // number -= 1; 선감소  --number(10) + 2 = 11
    }
}
