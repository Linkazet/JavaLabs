package Lab6.Example6;

public class Example6 {
    public static void main(String[] args) {
        int[] FirstArray = {1, 2, 3, 4 ,5 ,6 ,7 ,8 ,9};
        task task6 = new task();
        for (int i = 0; i < task6.SetArray(FirstArray, 10).length; i++) {
            System.out.println("MirrorArray[" + i + "] = " + task6.SetArray(FirstArray, 10)[i]);
        }
    }
}
class task {
    private static int MirrorArray[];
    public static int[] SetArray(int FirstArray[], int value) {
        if (value > FirstArray.length) {
            value = FirstArray.length;
        }
        MirrorArray = new int[value];
        for (int i = 0; i < value; i++) {
            MirrorArray[i] = FirstArray[i];
        }
        return MirrorArray;
    }
}
