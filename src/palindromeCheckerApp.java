/**
 * PalindromeCheckerApp
 * UC2: Print a Hardcoded Palindrome Result
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded String (String Literal)
        String word = "madam";

        // Reverse the string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check using if-else
        if (word.equals(reversed)) {
            System.out.println("The given word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The given word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}