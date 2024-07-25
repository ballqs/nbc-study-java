package SecondJava;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        // 얕은 복사
        // 배열은 참조형 변수이며 실제값이 아닌 실제값의 주소값을 가진다
        // 따라서 배열 변수간에 대입 연사자를 사용해서 복사를 하게 되면 주소값만 복사된다.
        // 주소값만 복사된다는 건 변수명은 서로 다르지만 같은 값을 보고 있다는 것
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a;
        b[0] = 10;
        System.out.println(a[0]);   // 출력값 : 10
        System.out.println(b[0]);   // 출력값 : 10

        // 깊은 복사
        // 실제 값을 가지고 있는 배열의 기본형 값을 꺼내서 복사
        // 반복문을 통해서 하나씩 꺼내서 복사해주는 방법과 여러 메서드를 사용하는 방법이 있다.

        // 방법1
        int[] c = {1, 2, 3, 4, 5};
        int[] d = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            d[i] = c[i];
        }
        d[0] = 10;
        System.out.println(c[0]);   // 출력값 : 1
        System.out.println(d[0]);   // 출력값 : 10

        // 방법2 clone()
        int[] e = c.clone();        // 단! 2차원 이상 배열에서는 얕은 복사로 동작!
        e[0] = 10;
        System.out.println(c[0]);   // 출력값 : 1
        System.out.println(d[0]);   // 출력값 : 10

        // 방법3 Arrays.copyOf()
        int[] f = Arrays.copyOf(c, c.length);
        f[0] = 20;
        System.out.println(c[0]);   // 출력값 : 1
        System.out.println(f[0]);   // 출력값 : 20
    }
}
