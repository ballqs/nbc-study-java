package SecondJava;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 배열 생성
        int[] intArray = new int[3];            //{0, 0, 0}
        boolean[] boolArray = new boolean[3];   //{false, false, false}
        String[] stringArray = new String[3];   //{"", "", ""}

        // 배열 선언 먼저! -> 나중에 초기화
        int[] intArray2;
        intArray2 = new int[3]; // {0, 0, 0}

        // 생성한 배열을 순회 -> 배열의 값을 하나씩 뽑아서 조회한다.
        // (1) 단건 조회
        System.out.println(intArray2[0]);

        // (2) 다건 조회(important!)
        for (int i : intArray2) {
            System.out.println(i);
        }

        // 배열에 특정값 대입해서 선언
        int[] intArray3 = {1, 2, 3, 4, 5};
        for (int i = 0; i < intArray3.length; i++) {
            System.out.println(intArray3[i]);
        }

        // 배열의 주소를 모두 같은 값으로 초기화!
        Arrays.fill(stringArray, "Test");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}
