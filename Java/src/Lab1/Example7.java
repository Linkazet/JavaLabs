package Lab1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String a = in.nextLine();

        System.out.println("Введите возраст: ");
        int b = in.nextInt();

        System.out.println("Ваше имя: " + a + "\nВаш возраст: " + b);
    }
}
