package Lab3;

import java.util.Scanner;

public class Example2_Swtich {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели: ");
        String a = in.nextLine().toLowerCase();
        switch (a) {
            case "понедельник":
                System.out.println("Порядковый номер равен 1");
                break;
            case "вторник":
                System.out.println("Порядковый номер равен 2");
                break;
            case "среда":
                System.out.println("Порядковый номер равен 3");
                break;
            case "четверг":
                System.out.println("Порядковый номер равен 4");
                break;
            case "пятница":
                System.out.println("Порядковый номер равен 5");
                break;
            case "суббота":
                System.out.println("Порядковый номер равен 6");
                break;
            case "воскресенье":
                System.out.println("Порядковый номер равен 7");
                break;
            default :
                System.out.println("Такого дня нет");
                break;
        }
    }
}
