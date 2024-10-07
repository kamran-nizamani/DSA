public class DoubleLinkedList {

    Node head;

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
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    // Add node with name at the end of the linked list
    public void insertAtEnd(String name) {
        Node newNode = new Node(name);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

  
    // Add node after the node with the given name
    public void insertAfterName(String name, Node node) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(name)) {
                node.next = temp.next;
                if (temp.next != null) {
                    temp.next.prev = node;
                }
                temp.next = node;
                node.prev = temp;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Name not found");
    }

    // Add node before the node with the given name
    public void insertBeforeName(String name, Node node) {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(name)) {
                node.prev = temp.prev;
                node.next = temp;
                if (temp.prev != null) {
                    temp.prev.next = node;
                } else {
                    head = node;
                }
                temp.prev = node;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Name not found");
    }

    // Make the doubly linked list circular
    public void makeCircular() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head.next = head;
            head.prev = head;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = head;
        head.prev = currNode;
    }

    // Print all nodes in the linked list
    public void printAll() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        Node start = head;

        // Print nodes until we loop back to the starting node
        while (current != null) {
            System.out.println(current.data);
            current = current.next;

            // If the list is circular, break the loop if we return to the start
            if (current == start) {
                break;
            }
        }
    }

    // Test the class
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.insertAtBeginning("kamran");
        list.insertAtEnd("test1");
        list.insertAtEnd("test2");
        list.insertAfterName("kamran", list.new Node("testAfterKamran"));
        list.insertBeforeName("test2", list.new Node("testBeforeTest2"));
        list.makeCircular();
        list.printAll();
        list.makeCircular();
        list.printAll();
    }

   
}
