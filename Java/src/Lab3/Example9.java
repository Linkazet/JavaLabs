package Lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int c = 0;
        while(a < 0){
            System.out.println("Введите корректное значение: ");
            a = in.nextInt();
        }
        int[] b = new int[a];
        Random rand = new Random();
        System.out.println("Вывод массива: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = rand.nextInt(100);
            if (i == 0) c = b[i];
            if (b[i] < c) {
                c = b[i];
            }
            System.out.println(b[i]);
        }
        System.out.println("Вывод минимальных элементов массива: ");
        for (int i = 0; i < b.length; i++) {
            if (b[i] == c) {
                System.out.println(b[i] + " индекс " + i);
            }
        }
    }
}
