import java.util.LinkedList;
import java.util.Queue;

// Implement Stack using two queues
class StackQueue {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    // Constructor
    Stack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push an element onto the stack
    public void push(int x) {
        // Add the new element to the empty queue
        q2.add(x);
        
        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        // Swap the names of the queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop the top element from the stack
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1; // Stack is empty
        }
        return q1.poll();
    }

    // Return the top element of the stack
    public int top() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1; // Stack is empty
        }
        return q1.peek();
    }

    // Return the size of the stack
    public int size() {
        return q1.size();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);      // Pushing 1 onto the stack
        stack.push(2);      // Pushing 2 onto the stack
        stack.push(3);      // Pushing 3 onto the stack

        System.out.println("Top element is: " + stack.top()); // Should print 3
        System.out.println("Stack size is: " + stack.size()); // Should print 3

        System.out.println("Popped element: " + stack.pop()); // Should print 3
        System.out.println("Popped element: " + stack.pop()); // Should print 2

        System.out.println("Stack is empty: " + stack.isEmpty()); // Should print false

        stack.pop(); // Popping the last element (1)
        System.out.println("Stack is empty: " + stack.isEmpty()); // Should print true
    }
}
