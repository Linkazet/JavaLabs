package Lab1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        String a = in.nextLine();

        System.out.println("Введите имя: ");
        String b = in.nextLine();

        System.out.println("Введите отчество: ");
        String c = in.nextLine();

        System.out.println("Hello" + " " + a + " " + b + " " + c);

    }
}
