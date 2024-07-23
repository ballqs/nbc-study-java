package SecondJava;

public class DArray {
    public static void main(String[] args) {
        // 다차원 배열
        int[][] array = new int[2][3];  // 최초 선언

        // 단건 조회
        for (int i = 0; i < array.length; i++) {
            for( int j = 0; j < array[i].length; j++) {
                System.out.println("출력값 => " + i + "," + j);
                array[i][j] = 5; // i, j 는 위 노란색 네모박스 안에 있는 숫자를 의미하며 인덱스 라고 부른다.
            }
        }

        // 다건 조회
        for (int[] i : array) {
            for (int j : i) {
                System.out.println(j);
            }
        }

    }
}
