import java.util.*;

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : clean.toCharArray()) stack.push(c);
        
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());
        
        return clean.equals(reversed.toString());
    }
}

class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : clean.toCharArray()) deque.addLast(c);
        
        while (deque.size() > 1) {
            if (!Objects.equals(deque.removeFirst(), deque.removeLast())) return false;
        }
        return true;
    }
}

class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.check(input);
    }
}

public class uc12 {
    public static void main(String[] args) {
        String text = "Race Car";
        PalindromeContext context = new PalindromeContext();

        context.setStrategy(new StackStrategy());
        System.out.println("Using Stack Strategy: " + context.executeStrategy(text));

        context.setStrategy(new DequeStrategy());
        System.out.println("Using Deque Strategy: " + context.executeStrategy(text));
    }
}
