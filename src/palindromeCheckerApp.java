/**
 * PalindromeCheckerApp
 * UC4: Character Array Based Palindrome Check
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string to char array
        char[] charArray = input.toCharArray();

        boolean isPalindrome = true;

        // Two-pointer technique
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}