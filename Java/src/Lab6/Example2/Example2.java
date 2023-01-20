package Lab6.Example2;

public class Example2 {
    public static void main(String[] args) {
        task task2 = new task();
        task2.show();
        task2.show();
        task2.show();
        task2.show();
        task2.show();

    }
}
class task {
    private static int value;

    public static void show() {
        System.out.println(value);
        value++;
    }
}