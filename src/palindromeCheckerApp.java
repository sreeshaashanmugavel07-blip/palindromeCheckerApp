/**
 * PalindromeCheckerApp
 * UC11: Object-Oriented Palindrome Service
 */

import java.util.Scanner;

// PalindromeChecker class encapsulates the logic
class PalindromeChecker {

    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check palindrome
    public boolean checkPalindrome() {

        String normalized = text.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Use PalindromeChecker class
        PalindromeChecker checker = new PalindromeChecker(input);

        if (checker.checkPalindrome())
            System.out.println("The given string is a Palindrome.");
        else
            System.out.println("The given string is NOT a Palindrome.");

        scanner.close();
    }
}