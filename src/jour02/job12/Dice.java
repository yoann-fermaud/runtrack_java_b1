package jour02.job12;

public class Dice {
    public static void main(String[] args) {
        int combination = 0;
        int[] die = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    int result = die[i] + die[j] + die[k];
                    combination++;
                    System.out.println("Combination " + combination + " is:\n"
                            + die[i] + " + " + die[j] + " + " + die[k] + " = " + result);
                }
            }
        }
    }
}
