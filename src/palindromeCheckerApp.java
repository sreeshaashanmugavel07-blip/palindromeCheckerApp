
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear  = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input String : " + input);

        if (isPalindrome) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}
