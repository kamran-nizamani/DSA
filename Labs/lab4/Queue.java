class Queue {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
/*  
    public void Enqueue(int data) {
        Node nNode = new Node(data);
        if (head == null) {
            head = nNode; // Initialize head
            tail = nNode;
        } else {
            tail.next = nNode;
            tail = nNode;
        }
    }

    public int Dequeue() {
        if (head == null) {
            System.out.println("Queue is Empty");
            return -1; // Indicate empty queue
        }
        int data = head.data; // Store data to return
        head = head.next;
        if (head == null) {
            tail = null; // Reset tail if queue is empty
        }
        return data; // Return the dequeued data
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.Enqueue(7);
        q.Enqueue(9);
        q.Enqueue(1);
        q.Enqueue(0);
        System.out.println(" Dequeue :"+q.Dequeue()); // Outputs: 7
        System.out.println(q.Dequeue()); // Outputs: 9
    } */



}
