package jour02.job09;

import java.util.Scanner;

public class FirstLastNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        String number = scanner.next();

        char firstDigit = number.charAt(0);
        char lastDigit = number.charAt(number.length() - 1);

        System.out.println("The first digit of " + number + " is " + firstDigit);
        System.out.println("The last digit of " + number + " is " + lastDigit);
    }
}
