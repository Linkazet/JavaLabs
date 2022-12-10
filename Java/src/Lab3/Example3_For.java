package Lab3;

import java.util.Scanner;

public class Example3_For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = 1; //Первое число последовательности
        int c = 1; //Второе число последовательности
        System.out.println(b + " ");
        System.out.println(c + " ");
        for (int i = 1; i<=a; i++) {
            int d = b + c;
            System.out.println(d + " ");
            b = c;
            c = d;
        }
    }
}
