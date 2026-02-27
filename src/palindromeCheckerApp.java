/**
 * PalindromeCheckerApp
 * UC5: Stack-Based Palindrome Checker
 */

import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string to char array
        char[] chars = input.toCharArray();

        // Create a stack
        Stack<Character> stack = new Stack<>();

        // Push all characters into the stack
        for (char c : chars) {
            stack.push(c);
        }

        // Pop characters to build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Check palindrome
        if (input.equals(reversed)) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}