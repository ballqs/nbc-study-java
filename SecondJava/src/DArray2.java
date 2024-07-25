package SecondJava;

public class DArray2 {
    public static void main(String[] args) {
        // 다차원배열의 가변배열
        int[][] array = new int[3][];

        // 배열 원소마다 각기 다른 크기로 지정
        array[0] = new int[2];
        array[1] = new int[4];
        array[2] = new int[10];

        // 중괄호로 초기화 할때도 가능
        int[][] array2 = {
            {10, 20, 30},
            {10, 20},
            {10, 20, 30, 40, 50}
        };

        // 최대값 구하기
        int max = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (max < array2[i][j]) {
                    max = array2[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
