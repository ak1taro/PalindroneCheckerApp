/**
 * =============================================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * =============================================================================
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Developer
 * @version 2.0
 */
public class UC2PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "level";

        if (word.equals("level")) {
            System.out.println("The word '" + word + "' is a palindrome.");
        } else {
            System.out.println("The word '" + word + "' is not a palindrome.");
        }
    }
}
