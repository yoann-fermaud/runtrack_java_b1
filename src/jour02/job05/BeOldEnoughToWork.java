package jour02.job05;

import java.util.Scanner;

public class BeOldEnoughToWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How old are you ? ");
        int userAge = scanner.nextInt();

        if (userAge > 67) {
            System.out.println("You are retired.");
        } else if (userAge > 55) {
            System.out.println("You will have a hard time finding a job.");
        } else if (userAge < 16) {
            System.out.println("You can't work.");
        } else {
            System.out.println("You can work.");
        }
    }
}
