class Recursive {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        Recursive r = new Recursive();
        r.head = r.new Node(1);
        r.head.next = r.new Node(2);
        r.head.next.next = r.new Node(3);
        r.head.next.next.next = r.new Node(4);

        r.head = r.reverseList(r.head);
        r.printList();
    }
}
