package jour02.job02;

public class Loop {
    public static void main(String[] args) {
        // First method
        System.out.println("First Method");
        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }

        // Second method
        System.out.println("\nSecond Method");
        int i = 100;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }
}
