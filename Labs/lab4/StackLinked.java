class Stack {
    // Node class representing each element in the stack
   

    private Node top; // Top node of the stack

    // Constructor
    public Stack() {
        top = null;
    }

    // Push method to add an element to the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop method to remove the top element from the stack
    public int pop() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    // Top method to get the top element of the stack
    public int top() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    // Main method to test the stack
    public static void main(String[] args) {
        Stack stack = new Stack();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.top()); // Output: 30
        System.out.println("Popped element: " + stack.pop());
         // Output: 30
        System.out.println("Top element after pop: " + stack.top()); // Output: 20
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.top());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.top());
}
}
