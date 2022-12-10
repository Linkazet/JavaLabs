package Lab2;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int a = in.nextInt();
        int b = a % 4;

        if (b==0 && a>=10) {
            System.out.println("Введенное число делится на 4 и оно больше 10");
        }
        else System.out.println("Введенное число не делится на 4 или оно меньше 10");
    }
}
