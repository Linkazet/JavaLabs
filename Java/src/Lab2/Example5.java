package Lab2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int a = in.nextInt();
        double b = a / 1000;
        System.out.println("Тысяч в числе: " + b%10);
    }
}
