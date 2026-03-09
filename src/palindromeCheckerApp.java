/**
 * PalindromeCheckerApp
 * UC9: Recursive Palindrome Checker
 */

import java.util.Scanner;

public class palindromeCheckerApp {

    // Recursive function to check palindrome
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

        if (isPalindromeRecursive(input, 0, input.length() - 1))
            System.out.println("The given string is a Palindrome.");
        else
            System.out.println("The given string is NOT a Palindrome.");

        scanner.close();
    }
}
