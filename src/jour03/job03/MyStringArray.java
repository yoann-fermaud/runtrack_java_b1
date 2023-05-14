package jour03.job03;

public class MyStringArray {
    public static void main(String[] args) {
        String[] myArray = {"Josette", "John", "Myrtille", "Marc"};

        System.out.println("At index 1 there is: " + myArray[1]);

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].equals("John")) {
                System.out.println("John's index is: " + i);
                break;
            }
        }

        myArray[2] = "Mireille";
        System.out.println("\nArray with new values: ");
        for (String element : myArray) {
            System.out.println(element);
        }
    }
}
