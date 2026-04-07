public class uc3 {
    public static void main(String[] args) {
        String original = "racecar";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i); 
        }

        if (original.equals(reversed)) {
            System.out.println("Original: " + original);
            System.out.println("Reversed: " + reversed);
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Original: " + original);
            System.out.println("Reversed: " + reversed);
            System.out.println("Result: It is NOT a palindrome.");
        }
    }
}
