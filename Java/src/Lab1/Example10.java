package Lab1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваш год рождения: ");
        int a = in.nextInt();
        int b = 2022;
        int c = b - a;
        System.out.println("В 2022 году вам будет " + c + " лет");



    }
}
