package Lab4;

public class Example1 {
    public static void main(String[] args) {
        int a = 11; // Число строк, которое необходимо вывести
        int i;
        int j;
        int z;

        for (i = 1; i <= a; i++) {
            System.out.print("Номер строки: " + i + " ");
            z = 0;
            for (j = -11; j <= a; j++) {
                System.out.print("+");
                z = z + 1;
            }
            System.out.println(" Количество символов в строке " + z);
        }
    }
}
