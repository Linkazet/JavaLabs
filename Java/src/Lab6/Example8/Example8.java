package Lab6.Example8;

import java.util.Random;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int [] array = new int [size];
        Random rand = new Random();
        for(int i = 0; i < size; i++) {
            array[i] = rand.nextInt(10);
            System.out.println("array[" + i + "] = " + array[i]);
        }
        task task8 = new task();
        float a = task8.mainMethod(array);
        System.out.println(a);
    }
}
class task {
    public static float mainMethod(int [] intArray) {
        float a = 0;
        for(int i = 0; i < intArray.length; i++){
            a = intArray[i] + a;
        }
        a = a / intArray.length;
        return a;
    }
}