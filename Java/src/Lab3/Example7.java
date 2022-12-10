package Lab3;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int a = in.nextInt();
        while (a < 0 || a >= 10) {
            System.out.println("Введите корректное значение: ");
            a = in.nextInt();
        }
        char [] b = new char[10];
        b[0] = 'a';
        b[1] = 'c';
        b[2] = 'e';
        b[3] = 'g';
        b[4] = 'i';
        b[5] = 'k';
        b[6] = 'm';
        b[7] = 'o';
        b[8] = 'q';
        b[9] = 's';

        System.out.println("Вывод массива: ");
        for (int i = 0; i < a; i++) {
            System.out.println(b[i] + " ");
        }
        System.out.println("Вывод обратного массива: ");
        for (int i = a - 1; i >= 0; i--) {
            System.out.println(b[i] + " ");
        }
    }
}
