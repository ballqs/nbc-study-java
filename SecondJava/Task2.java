package SecondJava;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 저장할 자료구조
        String structure = sc.nextLine();

        // 요리제목
        String title = sc.nextLine();

        String str;

        switch (structure) {
            case "Set":
                Set<String> set = new HashSet<>();
                while (true) {
                    str = sc.nextLine();
                    if (str.equals("끝")) {
                        break;
                    }
                    set.add(str);
                }
                
                System.out.println("[" + structure + " " + title + "]");
                int set_number = 1;
                for (String s : set) {
                    System.out.println((set_number++) + ". " + s);
                }
                break;
            case "Map":
                Map<Integer , String> map = new HashMap<>();
                int map_number = 0;
                while (true) {
                    str = sc.nextLine();
                    if (str.equals("끝")) {
                        break;
                    }
                    map.put(++map_number, str);
                }
                
                System.out.println("[" + structure + " " + title + "]");
                for (int k : map.keySet()) {
                    System.out.println(k + ". " + map.get(k));
                }
                break;
            case "List":
                ArrayList<String> list = new ArrayList<>();
                while (true) {
                    str = sc.nextLine();
                    if (str.equals("끝")) {
                        break;
                    }
                    list.add(str);
                }
                
                System.out.println("[" + structure + " " + title + "]");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + ". " + list.get(i));
                }
                break;
            default:
                System.out.println("아무것도 속한게 없음");
                break;
        }
    }
}
