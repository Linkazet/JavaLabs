package Lab3;

import java.util.Random;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int a = in.nextInt();
        while (a < 0) {
            System.out.println("Введите корректное значение: ");
            a = in.nextInt();
        }
        int[] b = new int [a];
        Random rand = new Random();
        System.out.println("Элементы созданного массива: ");
        for (int i = 0; i < b.length; i++) {
            do {
                b[i] = rand.nextInt(100);
            }
            while(b[i] % 5 != 2);
            System.out.println(b[i] + " ");
        }
    }
}
