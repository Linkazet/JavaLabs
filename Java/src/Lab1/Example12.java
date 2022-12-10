package Lab1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int a = in.nextInt();
        int b = 2022;
        int c = b - a;

        System.out.println("Вы родились в " + c + " году");
    }
}
