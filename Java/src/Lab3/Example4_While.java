package Lab3;

import java.util.Scanner;

public class Example4_While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();
        if (a < b) {
            int i = a;
            while (i<=b) {
                System.out.println(i + " ");
                i++;
            }
        } else {
            int i = b;
            while (i<=a) {
                System.out.println(i + " ");
                i++;
            }
        }
    }
}
