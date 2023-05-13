package jour02.job10;

public class Sum {
    public static void main(String[] args) {
        int number = 1234;
        int sum = 0;
        String numberString = Integer.toString(number);

        for (int i = 0; i < numberString.length(); i++) {
//            int digit = Character.getNumericValue(numberString.charAt(i));
            int digit = Integer.parseInt(String.valueOf(numberString.charAt(i)));
            sum += digit;
        }
        System.out.println("Sum of the digit " + number + " is: " + sum);
    }
}
