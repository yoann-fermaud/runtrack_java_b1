package jour01.job13;

import java.util.Scanner;

public class SequenceNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.print((i + 1));
            if (i != number - 1){
                System.out.print(", ");
            }
        }
    }
}
