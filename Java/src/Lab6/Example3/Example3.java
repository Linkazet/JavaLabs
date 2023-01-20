package Lab6.Example3;

public class Example3 {
    public static void main(String[] args) {
        task task3 = new task();
        task3.MaxValue(1,2,3,4,5,6);
        task3.MinValue(1,2,3,4,5,6);
        task3.SredneeValue(1,2,3,4,5,6);
    }
}
class task {
    static void MaxValue(int ... array) {
        int maximum = array[0];
        for (int i =0; i<array.length; i++) {
            maximum = Math.max(maximum, array[i]);
        }
        System.out.println(maximum);
    }
    static void MinValue(int ... array) {
        int minimum = array[0];
        for (int i =0; i<array.length; i++) {
            minimum = Math.min(minimum, array[i]);
        }
        System.out.println(minimum);
    }
    static void SredneeValue(int ... array) {
        int srednee = array[0];
        for (int i =0; i<array.length; i++) {
            srednee = array[i]+srednee;
        }
        float avg = (float)srednee/array.length;
        System.out.println(avg);
    }
}
