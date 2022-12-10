package Lab3;

import java.util.Scanner;

public class Example2_IfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели: ");
        String a = in.nextLine().toLowerCase();
        if (a.equals("понедельник")) {
            System.out.println("Порядковый номер равен 1");
        } else if (a.equals("вторник")){
            System.out.println("Порядковый номер равен 2");
        } else if (a.equals("среда")){
            System.out.println("Порядковый номер равен 3");
        } else if (a.equals("четверг")){
            System.out.println("Порядковый номер равен 4");
        } else if (a.equals("пятница")){
            System.out.println("Порядковый номер равен 5");
        } else if (a.equals("суббота")){
            System.out.println("Порядковый номер равен 6");
        } else if (a.equals("воскресенье")){
            System.out.println("Порядковый номер равен 7");
        }
    }
}
