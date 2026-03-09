/**
 * PalindromeCheckerApp
 * UC10: Case-Insensitive & Space-Ignored Palindrome
 */

import java.util.Scanner;

public class palindromeCheckerApp {

    // Recursive check
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) // Base condition
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        if (isPalindromeRecursive(normalized, 0, normalized.length() - 1))
            System.out.println("The given string is a Palindrome.");
        else
            System.out.println("The given string is NOT a Palindrome.");

        scanner.close();
    }
}
