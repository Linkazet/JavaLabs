package Lab6.Example9;

public class Example9 {
    public static void main(String[] args) {
        char[] char_array = {'a', 'b', 'c', 'd', 'e'};
        task task9 = new task();
        char newArray[] = task9.mainMethod(char_array);

        for (int i = 0; i < char_array.length; i++) {
            System.out.print(char_array[i]);
        }
        System.out.print("\n");
        for(int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
        }
    }
}
class task {
    public static char[] mainMethod(char [] charArray){
        char [] newArray = new char[charArray.length];
        int i = 0, k = newArray.length - 1;
        while (i< newArray.length){
            newArray[k]=charArray[i];
            i++;
            k--;
        }
        return newArray;
    }
}