package Lab6.Example5;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        task task5 = new task();
        System.out.print("Введите число: ");
        int n = in.nextInt();
        task5.sumSquare(n);
    }
}
class task {
    public static void sumSquare(int n){
        n = n * (n + 1) * (2 * n + 1)/6;
        System.out.println(n);
    }
}
