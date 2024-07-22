package SecondJava;

public class Logic {
    public static void main(String[] args) {
        // 논리연산자
        // 비교 연산의 겨로가값으로 받을 수 있는 boolean 값을 연결하는 연산자
        // 조건을 연결 하였을 때 boolean 값들을 조합하여 true 또는 false 값인 boolean 값 출력

        // &&(AND)
        // 앞에 조건은 10 == 10으로 true가 성립되지만 뒤에는 10 == 9여서 false이다. 그렇기에 AND 조건에 의해 false이다.
        System.out.println("(10 == 10) && (10 == 9) 결과 : " + ((10 == 10) && (10 == 9)));

        // ||(OR)
        // 앞과 뒤 조건에서 하나라도 true가 나오면 OR 조건에 의해 true가 된다.
        System.out.println("(10 == 10) || (10 == 9) 결과 : " + ((10 == 10) || (10 == 9)));

        // !(NOT)
        // 조건이 성립되면 NOT에 의해 뒤집는다.
        System.out.println("!(10 == 10) 결과 : " + !(10 == 10));
    }
}
