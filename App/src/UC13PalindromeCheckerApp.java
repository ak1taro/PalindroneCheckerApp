/**
 * ============================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Developer
 * @version 13.0
 */
public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "Level";

        long startTime = System.nanoTime();

        boolean isPalindrome = isPalindromeTwoPointer(input);

        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("Input  : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }

    /**
     * Palindrome algorithm using two-pointer technique.
     * Case-insensitive, ignores no characters (raw string check).
     *
     * @param text Input string
     * @return true if text is palindrome, otherwise false
     */
    private static boolean isPalindromeTwoPointer(String text) {
        if (text == null) {
            return false;
        }

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            char cLeft = Character.toLowerCase(text.charAt(left));
            char cRight = Character.toLowerCase(text.charAt(right));

            if (cLeft != cRight) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
