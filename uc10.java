public class uc10 {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Original: " + input);
        System.out.println("Normalized: " + normalized);
        if (isPalindrome) {
            System.out.println("Result: It is a palindrome (ignoring case and spaces).");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }
    }
}
