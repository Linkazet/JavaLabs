package timus.task_1409;

import java.util.Scanner;

public class task1409 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt(); // Количество прострелленых банок Гарри
        int b = in.nextInt(); // Количество прострелленых банок Ларри
        int c = a + b - 1; //Всего банок
        int d = c - a; //Количество не прострелленых банок Гарри
        int e = c - b; //Количество не прострелленых банок Ларри
        System.out.println(d + " " + e);
    }
}
