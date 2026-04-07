public class uc4 {
    public static void main(String[] args) {
        String input = "level";
        
        char[] charArray = input.toCharArray();
        
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
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
