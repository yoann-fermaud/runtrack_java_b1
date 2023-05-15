package jour04.job02;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class StringGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your length string: ");
        int lengthString = scanner.nextInt();

        long startTime = System.nanoTime();
        String stringGenerator = RandomStringGenerator(lengthString);

        try {
            // The creation of the file will be automatically managed by the FileWriter constructor
            // when opening the file.
            /*File file = new File("src/jour04/job02/output.txt");
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File output.txt was created successfully!");
            }*/

            FileWriter fileWriter = new FileWriter("src/jour04/job02/output.txt");
            fileWriter.write(stringGenerator);
            fileWriter.close();
            System.out.println("Data successfully written to output.txt file.");

        } catch (IOException e) {
            System.out.println("An error has occurred !");
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        long executionTime = (endTime - startTime) / 1_000_000;
        System.out.println("Execution time: " + executionTime + " milliseconds.");
    }

    private static String RandomStringGenerator(int lengthString) {
        Random random = new Random();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < lengthString; i++) {
            /*The nextInt(int n) method of the Random class is used to
            generate a random integer between 0 (inclusive) and the length of the characters (excluded)*/
            int index = random.nextInt(characters.length());
            /*The charAt(int index) method of the String class is used to
            retrieve the letter corresponding to the previously generated random index in the characters*/
            char randomChar = characters.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }
}
