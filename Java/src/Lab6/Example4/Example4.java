package Lab6.Example4;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        task task4 = new task();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int value = in.nextInt();
        task4.factorial(value);
    }
}
class task {
    public static void factorial(int n) {
        int a = n;
        int b = n;
        if (n % 2 == 0) {
            do {
                a = (a - 2);
                b = b * a;
            }
            while (a != 2);
        }
        if (n % 2 == 1) {
            do {
                a = (a - 2);
                b = b * a;
            }
            while (a != 1);
        }
        System.out.println(n + "!! = " + b);
    }
}