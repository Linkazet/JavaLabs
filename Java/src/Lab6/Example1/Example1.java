package Lab6.Example1;

public class Example1 {
    public static void main(String[] args) {
        task task1 = new task();
        task1.setValue('A');
        task1.setValue("B");
        char[] CharArray1 = {'п', 'р', 'и', 'в', 'е', 'т'};
        char[] CharArray2 = {'C'};
        task1.setValue(CharArray1);
        task1.setValue(CharArray2);
    }
}
class task {
    private char ch1;
    private String str1;

    public void setValue(char ch1) {
        this.ch1 = ch1;
        System.out.println(ch1);
    }

    public void setValue(String str1) {
        this.str1 = str1;
        System.out.println(str1);
    }

    public void setValue(char[] CharArray) {
        if (CharArray.length == 1) {
            ch1 = CharArray[0];
            System.out.println(ch1);
        } else {
            str1 = new String(CharArray);
            System.out.println(str1);
        }
    }
}
