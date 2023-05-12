package jour01.job09;

import java.lang.invoke.StringConcatFactory;

public class MyString {
    public static void main(String[] args) {
        // First way to create a string
        String firstString = new String("Hello world!");

        // Second way to create a string
        char[] chars = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        String secondString = new String(chars);

        // Third way to create a string
        String thirdString = "Hello world!";

        // Fourth way to create a string
        String fourthString = "Hello" + " world!";

        System.out.println(firstString);
        System.out.println(secondString);
        System.out.println(thirdString);
        System.out.println(fourthString);
    }
}
