package jour01.job10;

import java.util.Scanner;

public class Utilisateur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname = "";
        String lastname = "";
        String fullName = "";

        System.out.print("Enter your firstname: ");
        firstname = scanner.nextLine();

        System.out.print("Enter your lastname: ");
        lastname = scanner.nextLine();

        fullName = firstname + " " + lastname;
        System.out.println(fullName);
    }
}
