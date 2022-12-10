package Lab1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите наименование дня недели: ");
        String a = in.nextLine();

        System.out.println("Введите наимнование месяца: ");
        String b = in.nextLine();

        System.out.println("Введите номер дня в месяце: ");
        int c = in.nextInt();

        System.out.println(a + " " + b + " " + c);

    }
}
