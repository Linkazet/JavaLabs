package Lab3;

import java.util.Scanner;

public class Example5_While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = in.nextInt();
        int b = 0;
        int i = 0;
        while (i <= a) {
            i++;
            if ((i % 5 == 2) || (i % 3 == 1)) {
                System.out.println(i + " ");
                b = b + i;
            }
        }
        System.out.println("Сумма = " + b);
    }
}