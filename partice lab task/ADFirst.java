
class ADFirst {
    Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("List is empty");
        }
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    // Remove the node at the end of the list
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {
            // Only one node in the list
            head = null;
        } else {
            Node currentNode = head;
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
            // currentNode is now the second-to-last node
            currentNode.next = null;
        }
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ADFirst list = new ADFirst();
        list.addFirst(9);
        list.addFirst(7);
        list.addFirst(6);
        list.addFirst(10);
        list.removeFirst();
        list.addLast(2);
        list.removeLast();
        list.printList();
    }
}
