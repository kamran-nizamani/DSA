public class DoubleLinkedListUSinTail {

    Node head;
    Node tail;

    public class Node {
        String data;
        Node prev, next;

        Node(String data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Add node with name at the beginning of the linked list
    public void insertAtBeginning(String name) {
        Node newNode = new Node(name);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add node at the beginning of the linked list
    public void insertAtBeginning(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    // Add node with name at the end of the linked list
    public void insertAtEnd(String name) {
        Node newNode = new Node(name);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add node at the end of the linked list
    public void insertAtEnd(Node node) {
        if (tail == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    // Remove node from the beginning of the linked list
    public void removeFromBeginning() {
        if (head == null) {
            return; // Empty list
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Remove node from the end of the linked list
    public void removeFromEnd() {
        if (tail == null) {
            return; // Empty list
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Print all nodes in the linked list
    public void printAll() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Test the class
    public static void main(String[] args) {
        DoubleLinkedListUSinTail list = new DoubleLinkedListUSinTail();
        list.insertAtBeginning("A");
        list.insertAtEnd("B");
        list.insertAtEnd("C");
        list.printAll();
        list.removeFromBeginning(); // Ensure the correct method name
        list.printAll();
        list.removeFromEnd(); // Ensure the correct method name
        list.printAll();
    }
}
