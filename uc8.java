class Node {
    char data;
    Node next;
    Node(char data) { this.data = data; }
}

public class uc8{
    public static void main(String[] args) {
        String input = "noon";
        if (input.isEmpty()) return;

        Node head = new Node(input.charAt(0));
        Node current = head;
        for (int i = 1; i < input.length(); i++) {
            current.next = new Node(input.charAt(i));
            current = current.next;
        }

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        Node nextNode;
        while (slow != null) {
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        Node left = head, right = prev;
        boolean isPalindrome = true;
        while (right != null) {
            if (left.data != right.data) {
                isPalindrome = false;
                break;
            }
            left = left.next;
            right = right.next;
        }

        System.out.println("Input: " + input);
        System.out.println("Result: " + (isPalindrome ? "It is a palindrome." : "It is NOT a palindrome."));
    }
}
