package jour01.job14;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number one: ");
        int number00 = scanner.nextInt();

        System.out.print("Number two: ");
        int number01 = scanner.nextInt();

        int result = number00 + number01;
        System.out.println("Sum of your number: " + number00 + " + " + number01 + " = " + result);
    }
}
