package Assignment1;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {5, 3, 7, 6, 2, 8};
        forMethod(myArray);
        foreachMethod(myArray);
        whileMethod(myArray);
        dowhileMethod(myArray);
    }
    public static void forMethod(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
    public static void foreachMethod(int[] myArray) {
        for (int tempVar:myArray) {
            System.out.println(tempVar);
        }
    }
    public static void whileMethod(int[] myArray) {
        int i = 0;
        while(i< myArray.length) {
            System.out.println(myArray[i]); i++;
        }
    }
    public static void dowhileMethod(int[] myArray) {
        int i = 0;
        do {System.out.println(myArray[i]); i++; }
        while(i < myArray.length);
    }
}
