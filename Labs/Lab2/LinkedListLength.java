public class LinkedListLength {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        // Method to add a node to the end of the list
        public void add(int data) {
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

        // Method to find the length of the linked list
        public int length() {
            int length = 0;
            Node current = head;
            while (current != null) {
                length++;
                current = current.next;
            }
            return length;
        }

        // Method to print the linked list
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Adding elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Printing the list
        System.out.println("Linked List:");
        list.printList();

        // Finding and printing the length of the list
        int length = list.length();
        System.out.println("Length of the linked list: " + length);
    }
}
