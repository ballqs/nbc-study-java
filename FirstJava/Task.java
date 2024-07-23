package FirstJava;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String yoriTitle = sc.nextLine();
        double star = sc.nextDouble();

        sc.nextLine();

        String[] content = new String[10];
        for (int i = 0; i < content.length; i++) {
            content[i] = sc.nextLine();
        }

        System.out.println("[" + yoriTitle + "]");
        System.out.println("별점 : " + star + " (" + (star / 5) * 100 + "%)");

        for (int i = 0; i < content.length; i++) {
            System.out.println((i + 1) + ". " + content[i]);
        }
        
    }
}
