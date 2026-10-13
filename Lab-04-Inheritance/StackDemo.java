import java.util.ArrayList;

class Stack {
    private ArrayList<Integer> items = new ArrayList<>();

    public void push(int item) {
        items.add(item);
    }

    public int pop() {
        if (items.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return items.remove(items.size() - 1);
    }

    public int peek() {
        if (items.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return items.get(items.size() - 1);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}

public class StackDemo {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top item: " + stack.peek());
        System.out.println("Removed item: " + stack.pop());
        System.out.println("New top item: " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
