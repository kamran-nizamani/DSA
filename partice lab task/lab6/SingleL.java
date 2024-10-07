package lab6;

class SingleL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void AddLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    void AddFirst(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next; // Set the head to the next node, effectively removing the first node
        }
    }
    void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {
            // If there is only one element in the list
            head = null;
        } else {
            // Traverse to the second last node
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null; // Remove the last node
        }
    }
    public void Printlist() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SingleL s = new SingleL();
        s.AddFirst(8);
        s.AddFirst(3);
        s.AddFirst(0);
        s.AddLast(2);
        s.AddLast(7);

        System.out.print("Before removing first element: ");
        s.Printlist(); // Output: 0 3 8 2 7

        s.removeFirst(); // Removes the first element (0)

        System.out.print("After removing first element: ");
        s.Printlist(); // Output: 3 8 2 7
        
        System.out.print("After removing last element: ");
        s.removeLast();
    }
}
