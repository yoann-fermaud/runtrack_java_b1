package jour04.job03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class StringGeneratorTwoThreads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your length string: ");
        int lengthString = scanner.nextInt();

        long startTime = System.nanoTime();
        String stringGenerator = RandomStringGenerator(lengthString);

        int halfGenerateString = lengthString / 2;
        Thread thread00 = new Thread(() -> writeToFile(stringGenerator.substring(0, halfGenerateString),
                "src/jour04/job03/output.txt", false));
        Thread thread01 = new Thread(() -> writeToFile(stringGenerator.substring(halfGenerateString),
                "src/jour04/job03/output.txt", true));

        thread00.start();
        thread01.start();

        try {
            thread00.join();
            thread01.join();
        } catch (InterruptedException e) {
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

    private static void writeToFile(String content, String pathName, Boolean append) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathName, append))) {
            bufferedWriter.write(content);
            bufferedWriter.flush();
            bufferedWriter.close();
            System.out.println("Data successfully written to output.txt file.");

        } catch (IOException e) {
            System.out.println("An error has occurred !");
            e.printStackTrace();
        }
    }
}
