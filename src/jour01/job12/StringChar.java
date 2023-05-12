package jour01.job12;

import java.util.Scanner;

public class StringChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first character string: ");
        String string00 = scanner.nextLine();

        System.out.print("Enter the second character string: ");
        String string01 = scanner.nextLine();

        System.out.println("\nYour first string before swap is: " + string00);
        System.out.println("Your second string before swap is: " + string01);

        string00 += string01;
        string01 = string00.substring(0, (string00.length() - string01.length()));
        string00 = string00.substring(string01.length());

        System.out.println("\nYour first string after swap is: " + string00);
        System.out.println("Your second string after swap is: " + string01);
    }
}
