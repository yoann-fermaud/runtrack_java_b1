package jour02.job01;

public class Loop {
    public static void main(String[] args) {
        // First method
        System.out.println("First Method");
        for (int i = 0; i < 100; i++) {
            System.out.println(i + 1);
        }

        // Second method
        System.out.println("\nSecond Method");
        int i = 0;
        while (i < 100) {
            System.out.println(i + 1);
            i++;
        }
    }
}
