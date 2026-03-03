/**
 * ===============================================
 * MAIN CLASS – UseCase10PalindromeCheckerApp
 * ===============================================
 *
 * Use Case 10: Normalized Palindrome Validation
 *
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 *
 * Normalization includes:
 *  - Removing spaces and symbols
 *  - Converting to lowercase
 *
 * This ensures the palindrome check is logical rather
 * than character-format dependent.
 *
 * Example:
 *  "A man a plan a canal Panama"
 *
 * @author Developer
 * @version 10.0
 */
public class UC10PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        String normalized = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {
            // Compare symmetric characters
            if (normalized.charAt(i)
                    != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input  : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
