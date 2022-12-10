package Lab2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int a = in.nextInt();

        if (a>=5 && a<=10) {
            System.out.println("Введенное число попадает в диапозон от 5 до 10 включительно");
        }
        else System.out.println("Введенное число не попадает в диапозон от 5 до 10 включительно");
    }
}
