package jour02.job03;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int result = 0;

        System.out.print("Choose a number: ");
        number = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            result = number * (i + 1);
            System.out.println(number + " * " + (i + 1) + " = " + result);
        }
    }
}
