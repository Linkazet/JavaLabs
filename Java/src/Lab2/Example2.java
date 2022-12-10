package Lab2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int a = in.nextInt();
        int b = a % 5;
        int c = a % 7;

        if (b==2) {
            System.out.println("Введенное число делится на 5 с остатком 2");
        }
        else System.out.println("Введенное число не делится на 5 с остатком 2");
        if (c==1) {
            System.out.println("Введенное число делится на 7 с остатком 1");
        }
        else System.out.println("Введенное число не делится на 7 с остатком 1");
    }
}
