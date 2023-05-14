package jour03.job01;

public class MyArray {
    public static void main(String[] args) {
        int[] myArray = new int[5];

        myArray[0] = 10;
        myArray[2] = 2;
        myArray[4] = 69;
        for (int element : myArray) {
            System.out.println(element);
        }
    }
}
