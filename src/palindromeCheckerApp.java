/**
 * PalindromeCheckerApp
 * UC6: Queue + Stack Based Palindrome Check
 */

import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string to char array
        char[] chars = input.toCharArray();

        // Create stack and queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Push to stack & enqueue to queue
        for (char c : chars) {
            stack.push(c);       // LIFO
            queue.add(c);        // FIFO
        }

        boolean isPalindrome = true;

        // Compare pop (stack) vs dequeue (queue)
        while (!stack.isEmpty()) {
            char stackChar = stack.pop();
            char queueChar = queue.remove();

            if (stackChar != queueChar) {
                isPalindrome = false;
                break;
            }
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