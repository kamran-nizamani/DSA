class ArrQueue {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    char[] arr = new char[5]; // Corrected array initialization
    int read = 0;
    int write = 0;
    int size = 0;

    public void Enqueue(char data) {
        if (size < arr.length) { // Check if the queue is full
            arr[write] = data;
            write = (write + 1) % arr.length; // Use arr.length for flexibility
            size++;
        } else {
            System.out.println("Queue is full");
        }
    }

    public boolean isEmpty() { // Corrected method name and logic
        return size == 0; // Returns true if size is 0
    }

    public char Dequeue() {
        if (isEmpty()) { // Check if the queue is empty
            throw new IllegalStateException("Queue is empty");
        }
        char k = arr[read];
        read = (read + 1) % arr.length;
        size--;
        return k;
    }

    public static void main(String args[]) {
        ArrQueue aq = new ArrQueue();
        aq.Enqueue('A');
        aq.Enqueue('B');
        aq.Enqueue('C');
        aq.Enqueue('D');
        aq.Enqueue('E');
        System.out.println(aq.Dequeue()); // Outputs 'A'
        System.out.println(aq.Dequeue());
        System.out.println(aq.Dequeue());
    }
}
