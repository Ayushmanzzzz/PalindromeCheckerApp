import java.util.*;

public class uc13 {
    public static void main(String[] args) {
        String input = "redivider".repeat(1000); 

        long start1 = System.nanoTime();
        checkByReversal(input);
        long end1 = System.nanoTime();
        System.out.println("String Reversal Time: " + (end1 - start1) + " ns");

        long start2 = System.nanoTime();
        checkByTwoPointer(input);
        long end2 = System.nanoTime();
        System.out.println("Two-Pointer Time:    " + (end2 - start2) + " ns");

        long start3 = System.nanoTime();
        checkByStack(input);
        long end3 = System.nanoTime();
        System.out.println("Stack-Based Time:    " + (end3 - start3) + " ns");
    }

    public static boolean checkByReversal(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static boolean checkByTwoPointer(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) return false;
        }
        return true;
    }

    public static boolean checkByStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) stack.push(c);
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}
