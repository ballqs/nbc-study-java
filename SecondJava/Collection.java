package SecondJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Collection {
    public static void main(String[] args) {
        // Collection에는 List , Stack , Queue , Map , Set
        // 배열보다 다수의 참조형 데이터를 더 쉽고 효과적으로 처리할 수 있는 기능을 많이 가지고 있음
        // 컬렉션 기능: 크기 자동조정, 추가, 수정, 삭제, 반복, 순회, 필터, 포함확인
        // Collection은 기본형 변수가 아닌 참조형 변수를 저장한다.
        // Integer , Long , Double , String

        System.out.println("============List============");
        // List(ArrayList) - 순서가 있는 데이터의 집합(데이터 중복 허용)
        // 처음의 길이를 몰라도 만들 수 있음!
        // - 생성 시점에 작은 연속된 공간을 요청해서 참조형 변수들을 담아놓음
        // - 값이 추가될 때 더 큰 공간이 필요하면 더 큰 공간을 받아서 저장하기에 문제없음
        // 선언 방법 -> ArrayList<참조형> 변수명 = new ArrayList<참조형 넣어야하지만 생략해도 됨>();
        ArrayList<Integer> list = new ArrayList<>();
        // List(ArrayList) - 값 추가(add)
        list.add(1);
        list.add(2);
        list.add(3);
        // List(ArrayList) - 크기(size)
        list.size();
        // List(ArrayList) - 값 변경(set)
        list.set(1,20);
        // List(ArrayList) - 값 삭제(remove)
        list.remove(0); // 맨 처음에 넣은 1를 제거! (나머지 값들이 앞으로 밀림 index가 1씩 줄어든다고 보면 됨)
        // List(ArrayList) - 값 출력(get)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // List(ArrayList) - 문자로 출력(toString)
        System.out.println(list.toString());
        // List(ArrayList) - 값 초기화(clear)
        list.clear();
        System.out.println(list.toString());

        // Linked List
        // 메모리에 남는 공간에 요청해서 여기 저기 나누어서 실제 값을 담아놔요.
        // 실제 값이 잇는 주소값으로 목록을 구성하고 저장하는 자료구조.
        // ★기본적 기능은 -> ArrayList와 동일
        // LinkedList는 값 -> 여기 저기 나누어서 조회가 느리지만 값 추가 , 삭제는 빠르다.
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("============Stack============");
        // Stack - 마지막에 넣은 데이터를 제일 먼저 꺼낼 수 있는 자료구조(LIFO - Last In First Out) 프링글스 구조
        // push, peek , pop
        // 최근 저장된 데이터를 나열하고 싶거나, 데이터의 중복 처리를 막고 싶을 때 사용
        Stack<Integer> stack = new Stack<>();   // 선언 및 생성
        // Stack - 값 추가(push)
        stack.push(1);
        stack.push(10);
        stack.push(100);
        // Stack - 값 비어있는지 체크(isEmpty)
        System.out.println(stack.isEmpty());
        while (!stack.isEmpty()) {
            // Stack - 현재 꺼내야 할 데이터(peek) // 값을 제거하진 않음
            System.out.println(stack.peek());
            // Stack - 값 출력(pop)
            System.out.println(stack.pop());
        }

        System.out.println("============Queue============");
        // Queue - 한쪽에서 데이터를 넣고 다른 한쪽으로 데이터를 뺄 수 있는 자료구조(FIFO - First In First Out)
        // add, peek, poll
        // 생성자가 없는 인터페이스
        Queue<Integer> queue = new LinkedList<>(); // queue를 선언, 생성

        // Queue - 값 추가(add)
        queue.add(1);
        queue.add(10);
        queue.add(100);
        // Queue - 값 비어있는지 체크(isEmpty)
        while (!queue.isEmpty()) {
            // Queue - 현재 꺼내야 할 데이터(peek) // 값을 제거하진 않음
            System.out.println(queue.peek());
            // Queue - 값 출력(poll)
            System.out.println(queue.poll());
        }
        // Queue - 크기(size)
        System.out.println(queue.size());

        System.out.println("============Set============");
        // Set - 순서가 없는 데이터의 집합(데이터 중복 허용안함)
        // 그냥 사용 할수도 있지만 HashSet , TreeSet 등을 응용해서 같이 사용 가능
        // Set은 생성자가 없는 인터페이스
        // 생성자가 존재하는 HashSet을 이용해서 구현
        Set<Integer> set = new HashSet<>();
        // Set - 값 추가(add)
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(4);
        // Set - 값 존재유무(contains)
        System.out.println(set.contains(2));    // true
        System.out.println(set.contains(3));    // false

        System.out.println("============Map============");
        // Map - 순서가 없는 Key , Value 쌍으로 이루어진 데이터의 집합(Key값 중복 허용 안함)
        // Map -> HashMap , TreeMap으로 응용가능
        Map<String , Integer> map = new HashMap<>();
        // Map -> 값 추가(put)
        map.put("test", 1);
        map.put("test", 2); // 중복값
        map.put("test", 3); // 중복값
        map.put("test2", 1);
        // Map -> key 값 전체 출력(keySet)
        for (String str : map.keySet()) {
            System.out.println(str);
        }
        // Map -> value 값 전체 출력(values)
        for (int v : map.values()) {
            System.out.println(v);
        }
        // Map -> 값 하나만 출력(get)
        System.out.println(map.get("test"));
    }
}
