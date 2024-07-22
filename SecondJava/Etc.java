package SecondJava;

public class Etc {
    public static void main(String[] args) {
        // 기타 연산자

        // (1) 형변환 연산자
        int intNumber = 93 + (int)98.8;
        System.out.println(intNumber);

        // (2) 삼항 연산자
        // 10은 9보다 크기때문에 20를 int에 적용
        int intNumber2 = 10 > 9 ? 20 : 30;
        System.out.println(intNumber2);
    }
}
