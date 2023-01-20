package Lab6.Example7;

public class Example7 {
    public static void main(String[] args) {
        char [] char_array = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        task task7 = new task();
        int int_array[] = task7.mainMethod(char_array);
        for(int i = 0; i < char_array.length; i++) {
            System.out.print(char_array[i] + "\t");
        }
        System.out.print("\n");
        for(int i = 0; i < int_array.length; i++) {
            System.out.print(int_array[i] + "\t");
        }
        System.out.print("\n");
    }
}
class task {
    static int[] mainMethod(char [] char_array){
        int [] int_array = new int [char_array.length];
        for(int i = 0; i < int_array.length; i++) {
            int_array[i] = char_array[i];
        }
        return int_array;
    }
}