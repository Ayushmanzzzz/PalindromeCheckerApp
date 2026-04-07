import java.util.ArrayDeque;
import java.util.Deque;

public class uc7 {
    public static void main(String[] args) {
        String input = "rotator";
        
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Input: " + input);
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Input: " + input);
            System.out.println("Result: It is NOT a palindrome.");
        }
    }
}
