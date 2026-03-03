/**
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class demonstrates palindrome validation using
 * object-oriented design.
 *
 * The palindrome logic is encapsulated inside a
 * PalindromeService class.
 *
 * This improves:
 * - Reusability
 * - Readability
 * - Separation of concerns
 *
 * @author Developer
 * @version 1.0
 */

public class UC11PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     *
     * @ak1taro args Command-line arguments
     */
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("=== UC11: Object-Oriented Palindrome Service ===");
        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();

        PalindromeService service = new PalindromeService();
        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     *
     * Hint logic (two-pointer technique inspired by the document):
     * - Initialize pointers: start = 0, end = input.length() - 1
     * - Move pointers towards the center while characters match
     * - If mismatch occurs, return false
     * - If loop finishes, return true
     *
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Normalize input: remove spaces and make case-insensitive
        String normalized = input.replaceAll("\\s+",
