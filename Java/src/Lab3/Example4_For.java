package Lab3;

import java.util.Scanner;

public class Example4_For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i + " ");
            }
        } else {
            for (int i = b; i <= a; i++) {
                System.out.println(i + " ");
            }
        }
    }
}
