/**
 * ================================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque (Double Ended Queue). [web:4]
 *
 * Characters are inserted into the deque and then compared by
 * removing elements from both ends using:
 *  - removeFirst()
 *  - removeLast() [web:7]
 *
 * This avoids reversing the string and provides an efficient
 * front-to-back comparison approach. [web:8]
 *
 * This use case demonstrates optimal bidirectional traversal
 * using Deque.
 *
 * @author Developer
 * @version 7.0
 */
import java.util.Deque;
import java.util.ArrayDeque;

public class UC7PalindromeCheckerApp {

    //Application entry point for UC7.
    public static void main(String[] args) {

        // Define the input string
        String input = "refer";

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        while (deque.size() > 1 && isPalindrome) {
            char first = deque.removeFirst();
            char last  = deque.removeLast();
            if (first != last) {
                isPalindrome = false;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
