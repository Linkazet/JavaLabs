package timus.task_2012;

import java.util.Scanner;

public class task2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(); // Количество задач, сколько Гриша хочет решить за час времени
        int b = 12 - a; // Количество задач, которые Гриша должен решить за оставшееся время
        int c = 45 * b; // Время, которое понадобится Грише на решение оставшихся задач
        if (c > 240) {
            System.out.println("NO");
        } else System.out.println("YES");
    }
}
