package jour04.job05;

import jour04.job04.NumberCounter;

import java.util.Scanner;

public class NumberCounterTwoThreads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Maximum number to count: ");
        long numberCount = scanner.nextLong();

        long startTime = System.nanoTime();

        Threading threading = new Threading(numberCount);
        threading.run();
        long result = threading.getCount();

        long endTime = System.nanoTime();
        long executionTime = (endTime - startTime) / 1_000_000;
        System.out.println("Execution time: " + executionTime + " milliseconds.");
        System.out.println("Final number: " + result);
    }

    static class Threading extends Thread {
        private final long endNumber;
        private long result;

        public Threading(long endNumber) {
            this.endNumber = endNumber;
            this.result = 0;
        }

        @Override
        public void run() {
            for (int i = 0; i < this.endNumber; i++) {
                this.result += 1;
            }
        }

        public long getCount() {
            return this.result;
        }
    }
}
