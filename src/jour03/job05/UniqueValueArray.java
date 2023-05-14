package jour03.job05;

public class UniqueValueArray {
    public static void main(String[] args) {
        int[] myArray = {3, 7, 3, 9, 8};
        int[] newArray = new int[myArray.length];
        int incr = 0;

        for (int i : myArray) {
            boolean uniqueFlag = true;
            for (int j : newArray) {
                if (i == j) {
                    uniqueFlag = false;
                    break;
                }
            }
            if (uniqueFlag) {
                System.out.print(i);
                newArray[incr++] = i;
                if (incr < myArray.length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}
