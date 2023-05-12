package jour01.job11;

import java.util.Scanner;

public class Hours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a duration in minutes: ");
        int minutes = scanner.nextInt();

        int hours = minutes / 60;
        int rest = minutes % 60;

        System.out.println(minutes + " minutes is equivalent to " + hours + " hours and " + rest + " minutes.");
    }
}
