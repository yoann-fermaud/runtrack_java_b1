package jour02.job08;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        String number = scanner.next();

        int numberDigits = number.length();
        System.out.println("The number of digits in " + number + " is: " + numberDigits);
    }
}
