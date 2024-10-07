public class ReverseOder {
    Node head;  

    
    class Node {
        int data;
        Node next;

        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;  
        } else {
            Node current = head;
            while (current.next != null) {  
                current = current.next;
            }
            current.next = newNode;  
        }
    }

    
    public void printReverse() {
        printReverseRecursive(head);
        System.out.println();
    }

    
    private void printReverseRecursive(Node node) {
        if (node == null) {
            return;  
        }
        printReverseRecursive(node.next);  
        System.out.print(node.data + " ");  
    }

    
    public static void main(String[] args) {
        ReverseOder rs = new ReverseOder();
        rs.add(1);  
        rs.add(2);
        rs.add(3);
        rs.add(4);

        System.out.println("Print in reverse order:");
        rs.printReverse();  
    }
}
