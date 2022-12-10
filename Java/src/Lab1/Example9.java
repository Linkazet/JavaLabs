package Lab1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите наименование месяца: ");
        String a = in.nextLine();

        System.out.println("Введите количество дней в месяце :");
        int b  = in.nextInt();

        System.out.println("В " + a + " содержится " + b + " дней");
    }
}
