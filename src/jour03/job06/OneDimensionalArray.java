package jour03.job06;

import java.util.Random;

public class OneDimensionalArray {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(20);
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            if (i < myArray.length - 1){
                System.out.print(", ");
            }
        }
    }
}
