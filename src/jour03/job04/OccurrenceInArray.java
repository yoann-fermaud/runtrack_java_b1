package jour03.job04;

public class OccurrenceInArray {
    public static void main(String[] args) {
        int[] myArray = {3, 7, 3, 9, 8};

        int arrayMaxValue = myArray[0];
        for (int element : myArray) {
            if (arrayMaxValue < element) {
                arrayMaxValue = element;
            }
        }

        int[] occurrence = new int[arrayMaxValue + 1];
        for (int element : myArray) {
            occurrence[element]++;
        }

        for (int i = 0; i < occurrence.length; i++) {
            if (0 < occurrence[i]) {
                System.out.println("The number " + i + " appeared " + occurrence[i] + " times.");
            }
        }
    }
}
