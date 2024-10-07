public class LinkedListSearch {

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

        // Method to search for a specific element
        public boolean search(int target) {
            Node current = head;
            while (current != null) {
                if (current.data == target) {
                    return true; // Element found
                }
                current = current.next; // Move to the next node
            }
            return false; // Element not found
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

        // Searching for elements
        int searchElement = 30;
        boolean found = list.search(searchElement);
        System.out.println("Element " + searchElement + " found: " + found);

        searchElement = 100;
        found = list.search(searchElement);
        System.out.println("Element " + searchElement + " found: " + found);
    }
}
