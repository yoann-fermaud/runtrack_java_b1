package jour02.job07;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int x = 0, y = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your factorial: ");
        x = scanner.nextInt();

        for (int i = 0; i < x; i++) {
            y *= (i + 1);
        }
        System.out.println("The factorial of " + x + " is: " + y);
    }
}
