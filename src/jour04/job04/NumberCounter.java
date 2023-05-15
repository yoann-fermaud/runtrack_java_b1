package jour04.job04;

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Maximum number to count: ");
        int numberCount = scanner.nextInt();

        long startTime = System.nanoTime();

        int result = 0;
        for (int i = 0; i < numberCount; i++) {
            result += 1;
        }

        long endTime = System.nanoTime();
        long executionTime = (endTime - startTime) / 1_000_000;
        System.out.println("Execution time: " + executionTime + " milliseconds.");
        System.out.println("Final number: " + result);
    }
}
