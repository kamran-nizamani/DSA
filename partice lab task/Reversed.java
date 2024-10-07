public class Reversed {
    static final int LIST_EMPTY = -1; 

    static class Node { 
        int data; 
        Node next; 

        Node(int data) { 
            this.data = data; 
            this.next = null; 
        } 
    } 

    private Node head; 

    public int reverse() { 
        if (head == null) { 
            return LIST_EMPTY; 
        } 

        Node previous = null; 
        Node current = head; 

        while (current != null) { 
            Node next = current.next; 
            current.next = previous; 
            previous = current; 
            current = next; 
        } 

        head = previous; 
        return 0; 
    } 

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

    public void printList() { 
        Node temp = head; 
        while (temp != null) { 
            System.out.print(temp.data + " -> "); 
            temp = temp.next; 
        } 
        System.out.println("null"); 
    } 

    public static void main(String[] args) { 
        Reversed list = new Reversed(); 
        list.add(50); 
        list.add(40); 
        list.add(30); 
        list.add(20); 
        list.add(10); 

        System.out.println("Before reversing:"); 
        list.printList(); 

        list.reverse(); 

        System.out.println("After reversing:"); 
        list.printList(); 
    } 
}
