package Lab4;

import java.util.Random;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество столбцов массива");
        int a = in.nextInt();
        System.out.println("Введите количество строк массива");
        int b = in.nextInt();
        int[][] mass1 = new int[a][b];
        Random rand = new Random();
        for (int i = 0; i < a; i++) {
            System.out.println("Номер строки: " + i + " ");
            for (int j = 0; j < b; j++) {
                mass1[i][j] = rand.nextInt(100);
                System.out.println(mass1[i][j]);
            }
        }
        int c = rand.nextInt(a - 1);
        int d = rand.nextInt(b - 1);
        int[][] mass2 = new int[a - 1][b - 1];
        for (int i = 0, e = 0; i < a - 1; e++) {
            if (e != c) {
                System.out.println("Номер строки массива, у которого удалена 1 строка и 1 столбец: " + i + " ");
                for (int j = 0, f = 0; j < b - 1; f++) {
                    if (f != d) {
                        mass2[i][j] = mass1[e][f];
                        System.out.println(mass2[i][j]);
                        j++;
                    }
                }
                i++;
            }
        }
    }
}