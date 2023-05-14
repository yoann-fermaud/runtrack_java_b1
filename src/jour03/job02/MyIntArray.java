package jour03.job02;

public class MyIntArray {
    public static void main(String[] args) {
        int[] myArray = {12, 6, 76, 89};

        for (int element : myArray) {
            System.out.println(element);
        }

        System.out.println("\nChange of values");

        myArray[1] = 22;
        myArray[2] = 100;
        for (int element : myArray) {
            System.out.println(element);
        }
    }
}
