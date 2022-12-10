package Lab3;

import java.util.Random;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        while (a < 0) {
            System.out.println("Введите корректное значение: ");
            a = in.nextInt();
        }
        int[] b = new int[a];
        Random rand = new Random();
        System.out.println("Массив: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = rand.nextInt(100);
            System.out.println(b[i]);
        }
        int c;
        for (int j = 0; j < b.length; j++) {
            for (int i = 0; i < b.length - 1; i++) {
                if (b[i] < b[i+1]) {
                    c = b[i];
                    b[i] = b[i+1];
                    b[i+1] = c;
                }
            }
        }
        System.out.println("Отсортированный массив: ");
        for (int j: b) {
            System.out.println(j);
        }
    }
}
