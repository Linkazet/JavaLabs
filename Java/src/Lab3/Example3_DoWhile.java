package Lab3;

import java.util.Scanner;

public class Example3_DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = 1; //Первое число последовательности
        int c = 1; //Второе число последовательности
        int i = 1;
        do {
            System.out.println(b + " ");
            int d = b + c;
            b = c;
            c = d;
            i++;
        }   while (i<=a);
    }
}