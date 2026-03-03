/**
 * =============================================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * =============================================================================
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author ak1taro
 * @version 3.0
 */
public class UC3PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "radar";
        String reversed = "";

        // Iterate from the last character to the first.
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Compare original and reversed strings
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Result: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }
    }
}
