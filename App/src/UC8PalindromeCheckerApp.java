/**
 * ================================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome using a LinkedList. [web:21]
 *
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 *  - removeFirst()
 *  - removeLast() [web:16]
 *
 * This demonstrates how LinkedList supports double-ended
 * operations for symmetric validation. [web:24]
 *
 * Hint used:
 *  // Define the input string
 *  String input = "level";
 *
 *  // Create a LinkedList to store characters
 *  LinkedList<Character> list = new LinkedList<>();
 *
 *  // Add each character to the linked list
 *  for (char c : input.toCharArray()) { ... }
 *
 *  // Flag to track palindrome state
 *  boolean isPalindrome = true;
 *
 *  // Compare until only one or zero elements remain
 *  while (list.size() > 1) { ... }
 */

import java.util.LinkedList;

public class UseCase8PalindromeCheckerApp {

    /**
     * Application entry point for UC8.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "level";

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.addLast(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1 && isPalindrome) {
            char first = list.removeFirst();   // from front
            char last  = list.removeLast();    // from back
            if (first != last) {
                isPalindrome = false;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
