/**
 * PalindromeCheckerApp
 * UC12: Strategy Pattern for Palindrome Algorithms
 */

import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

// Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {

        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : normalized.toCharArray())
            stack.push(c);

        for (char c : normalized.toCharArray())
            if (c != stack.pop())
                return false;

        return true;
    }
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {

        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : normalized.toCharArray())
            deque.addLast(c);

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast())
                return false;
        }

        return true;
    }
}

// PalindromeChecker uses strategy
class palindromeChecker {

    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        return strategy.isPalindrome(input);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Choose strategy dynamically
        System.out.println("Choose algorithm: 1) Stack 2) Deque");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        PalindromeStrategy strategy;

        if (choice == 1)
            strategy = new StackStrategy();
        else
            strategy = new DequeStrategy();

        PalindromeChecker checker = new PalindromeChecker(strategy);

        if (checker.checkPalindrome(input))
            System.out.println("The given string is a Palindrome.");
        else
            System.out.println("The given string is NOT a Palindrome.");

        scanner.close();
    }
}
