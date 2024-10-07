class Queue {

    private Node rear = null, front = null;

    // Inner Node class
    class Node {
        int data; 
        Node next; 

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    public int dequeue() {
    
        if (front == null) {
            System.out.println("Queue is empty");
            return -1; 
        }

        
        int data = front.data;
        front = front.next;

        
        if (front == null) {
            rear = null;
        }

        return data;
    }

    // Utility function to add an item in the queue
    public void enqueue(int item) {
        Node newNode = new Node(item);

    
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Utility function to return the front element in the queue
    public int Top() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1; 
        }
        return front.data;
    }

    // Utility function to check if the queue is empty or not
    public boolean isEmpty() {
        return front == null;
    }
}

class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        System.out.printf("Front element is %d\n", q.Top());
        
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        
        if (q.isEmpty()) {
            System.out.print("Queue is empty");
        } else {
            System.out.print("Queue is not empty");
        }
    }
}
