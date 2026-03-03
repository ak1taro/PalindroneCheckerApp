/**
 * ============================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 *
 * At this stage, the application:
 * - Defines a common PalindromeStrategy interface
 * - Implements a concrete Stack based strategy
 * - (Optionally) can be extended with Deque based strategy
 * - Injects the strategy at runtime
 * - Executes the selected algorithm
 *
 * The goal is to teach extensible algorithm design.
 */
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {
        // Choose algorithm dynamically.
        // For now we use StackStrategy. You can later swap this
        // with a DequeStrategy implementation without changing
        // the rest of the code.
        PalindromeStrategy strategy = new StackStrategy();

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Input  : ");
        String input = scanner.nextLine();
        scanner.close();

        boolean result = strategy.check(input);
        System.out.println("Is Palindrome? : " + result);
    }
}

/**
 * ============================================================
 * INTERFACE - PalindromeStrategy
 * ============================================================
 *
 * This interface defines a contract for all
 * palindrome checking algorithms.
 *
 * Any new algorithm must implement this interface
 * and provide its own validation logic.
 */
interface PalindromeStrategy {

    /**
     * Validates whether the given input is a palindrome.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    boolean check(String input);
}

/**
 * ============================================================
 * CONCRETE STRATEGY - StackStrategy
 * ============================================================
 *
 * This class provides a Stack based implementation
 * of the PalindromeStrategy interface.
 *
 * It uses LIFO behavior to reverse characters
 * and compare them with the original sequence.
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    @Override
    public boolean check(String input) {

        if (input == null) {
            return false;
        }

        // Normalize the input: remove spaces and make lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Create a stack to store characters.
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character of the input string onto the stack.
        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack.
        for (char c : normalized.toCharArray()) {
            if (stack.pop() != c) {
                return false;
            }
        }

        return true;
    }
}

/**
 * ============================================================
 * (OPTIONAL) ANOTHER STRATEGY - DequeStrategy
 * ============================================================
 *
 * This strategy can be added later to use a deque
 * for front–back comparison without extra space.
 * Shown here for extensibility.
 */
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        if (input == null) {
            return false;
        }

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();
        for (char c : normalized.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}
