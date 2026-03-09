/**
 * PalindromeCheckerApp
 * UC13: Performance Comparison of Palindrome Algorithms
 */

import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

// Stack-based
class StackStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : normalized.toCharArray()) stack.push(c);
        for (char c : normalized.toCharArray())
            if (c != stack.pop()) return false;
        return true;
    }
}

// Deque-based
class DequeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : normalized.toCharArray()) deque.addLast(c);
        while (deque.size() > 1)
            if (deque.removeFirst() != deque.removeLast()) return false;
        return true;
    }
}

// Recursive-based
class RecursiveStrategy implements PalindromeStrategy {
    private boolean helper(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return helper(str, start + 1, end - 1);
    }
    public boolean isPalindrome(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        return helper(normalized, 0, normalized.length() - 1);
    }
}

// PalindromeChecker with strategy
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

        // Define all strategies
        PalindromeStrategy[] strategies = {
                new StackStrategy(),
                new DequeStrategy(),
                new RecursiveStrategy()
        };

        String[] names = {"Stack Strategy", "Deque Strategy", "Recursive Strategy"};

        // Run each algorithm and measure time
        for (int i = 0; i < strategies.length; i++) {
            long startTime = System.nanoTime();
            boolean result = strategies[i].isPalindrome(input);
            long endTime = System.nanoTime();

            System.out.printf("%s: %s, Time: %d ns%n",
                    names[i],
                    result ? "Palindrome" : "Not Palindrome",
                    (endTime - startTime));
        }

        scanner.close();
    }
}
