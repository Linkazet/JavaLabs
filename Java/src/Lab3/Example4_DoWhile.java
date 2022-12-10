package Lab3;

import java.util.Scanner;

public class Example4_DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();
        if (a < b) {
            int i = a;
            do {
                System.out.println(i + " ");
                i++;
            }
            while (i<=b);
        } else {
            int i = b;
            do {
                System.out.println(i + " ");
                i++;
            }
            while (i<=a);
        }
    }
}