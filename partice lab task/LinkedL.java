

class LinkedL {
    Node head;
    Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeLast() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
            return;
        }
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        current.next = null;
        tail = current;
    }

    public void removeFirst() {
        if (head == null) return;
        head = head.next;
        if (head == null) tail = null;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedL list = new LinkedL();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.printList(); // Output: 30 20 10

        list.removeFirst();
        list.printList(); // Output: 20 10

        list.addLast(40);
        list.printList(); // Output: 20 10 40

        list.removeLast();
        list.printList(); // Output: 20 10
    }
}
