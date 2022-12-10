package Lab1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String a = in.nextLine();

        System.out.println("Введите ваш год рождения");
        int b = in.nextInt();

        System.out.println("Ваше имя " + a + " вы родились в " + b);
    }
}
