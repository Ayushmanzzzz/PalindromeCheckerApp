// PalindromeChecker: Encapsulates the logic (Single Responsibility Principle)
class PalindromeCheck {
    
    public boolean checkPalindrome(String input) {
        if (input == null || input.isEmpty()) return false;
        
        String cleanStr = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = cleanStr.length() - 1;
        
        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class uc11 {
    public static void main(String[] args) {
        PalindromeCheck checker = new PalindromeCheck();
        
        String testInput = "Was it a car or a cat I saw?";
        
        boolean result = checker.checkPalindrome(testInput);
        
        System.out.println("Input String: " + testInput);
        if (result) {
            System.out.println("Result: It is a valid palindrome.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }
    }
}
