package jour02.job06;

public class SumEvenNumber {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of the even numbers between 1 and 100 is: " + sum);
    }
}
