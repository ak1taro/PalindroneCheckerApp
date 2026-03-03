/**
 * ============================================================
 * MAIN CLASS – UseCase5PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * At this stage, the application:
 *  - Pushes characters into a stack
 *  - Pops them in reverse order
 *  - Compares with original sequence
 *  - Displays the result
 *
 * This maps stack behavior to reversal logic.
 *
 * @author Developer
 * @version 5.0
 */
import java.util.Stack;

public class UC5PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     *
     * @ak1taro args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "noon";

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            char fromStack = stack.pop();
            if (c != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
