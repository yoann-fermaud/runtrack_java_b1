package jour01.job08;

public class Facture {
    public static void main(String[] args) {
        final float tva = 0.20F;

        int quantity = 3;
        float price = 49.99F;

        float total = quantity * price;
        float tax = total * tva;
        float priceIncludingTax = total + tax;

        System.out.println("The total amount is: " + total);
        System.out.println("The amount of tax is: " + tax);
        System.out.println("The total amount to be paid: " + priceIncludingTax);
    }
}
