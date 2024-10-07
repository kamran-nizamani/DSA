public class Queue {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void Enqueue(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void Dequeue() {
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        } else {
            head = head.next;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.Enqueue(1);
        q.Enqueue(4);
        q.Enqueue(3);
        q.Enqueue(5);
        q.Dequeue();
        q.print();
    }
}