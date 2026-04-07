import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class uc6 {
    public static void main(String[] args) {
        String input = "deified";
        
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
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
