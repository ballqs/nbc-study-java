package FirstJava;

import java.util.Arrays;

public class RefType {

    public static void main(String[] args) {
        // 참조형 변수
        // 단일 공간에 담을수 없는 변수
    
        // 문자열 변수 : String
        // 문장의 끝에 \0(널문자)가 함께 저장이 됩니다.
        // 몇개의 byte를 쓸지 모르기 때문에 끝을 표시해야 합니다.
        // ex)abcdefg    =>    abcdefg\0
        String message = "Hello World"; // ''으로 사용 불가합니다. "" 안에 작성해야 함
    
        // 그 외 : Object, Array, List...
        // 객체 , 배열 , 리스트와 같은 단일 저장고간에 담을 수 없는 값을 저장
        int[] alphabet = {1,2,3,4,5};
        System.out.println(alphabet); // I@4563e9ab 같은 알수 없는 문자가 출력되는데 참조형 변수라서 그런 것!
        System.out.println(Arrays.toString(alphabet));  // ★Arrays.toString 기능을 통해 해당 배열 값을 출력해서 확인 가능!


        // 참조형 변수 = 주소형 변수
        // 다른 기본형 변수가 실제 값을 저장하는 저장공간이라면 참조형 변수는 실제값이 아닌 원본값의 주소값을 저장합니다.
        // 기본형 변수 : 원본값은 stack 영역에 저장
        // 참조형 변수 : Heap 영역에 저장(별도공간)

        // Stack의 경우 정적으로 할당된 메모리 영역
        // ㄴ 그래서 크기가 몇 byte 인지 정해져 있는 기본형 변수 저장
        // ㄴ 크기가 정해져 있는 참조형 변수의 주소값도 저장
        // Heap의 경우 동적으로 할당된 메모리 영역
        // ㄴ 크기가 늘어날 수 있는 참조형 변수의 원본을 저장


        
    }

}
