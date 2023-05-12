package jour01.job06;

public class ExerciceVariable {
    public static void main(String[] args) {
        int num00 = 12, num01 = 22, buffer;
        System.out.println("Value of number one = " + num00 + " and value of number two = " + num01 + "\n");

        // Swap the value of numbers with a buffer variable
        buffer = num00;
        num00 = num01;
        num01 = buffer;
        System.out.println("First swap \nValue of number one = " + num00 + " and value of number two = " + num01);

        // New way to swap
        num00 ^= num01;
        num01 ^= num00;
        num00 ^= num01;
        System.out.println("Second swap \nValue of number one = " + num00 + " and value of number two = " + num01);
    }
}
