package Lab4;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите высоту прямоугольника");
        int b = in.nextInt();
        System.out.println("Введите ширину прямоугольника");
        int c = in.nextInt();
        int i;
        int j;
        int z;
        char[][] mass = new char [b][c];
        for (i = 0; i < b; i++) {
            for (j = 0; j < c; j++) {
                mass[i][j] = 'o';
            }
        }
        for (i = 0; i < b; i++) {
            System.out.println("Номер строки: " + i + " ");
            z = 0;
            for (j = 0; j < c; j++) {
                System.out.println(mass[i][j] + " ");
                z = z + 1;
            }
            System.out.println("Количество символов в строке " + z);
        }
    }
}
