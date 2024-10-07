package lab7;

public class PrintLinked {

  
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    static class LinkedList {
        Node head;

       
        public void addNode(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node lastNode = head;
                while (lastNode.next != null) {
                    lastNode = lastNode.next;
                }
                lastNode.next = newNode;
            }
        }

        
        public void printIterative() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

      
        public void printRecursive(Node node) {
            if (node == null) {
                return;
            }
            System.out.print(node.data + " ");
            printRecursive(node.next);
        }

        
        public long calculateIterativeTime() {
            long startTime = System.currentTimeMillis();
            printIterative();
            long endTime = System.currentTimeMillis();
            return endTime - startTime;
        }

       
        public long calculateRecursiveTime() {
            long startTime = System.currentTimeMillis();
            printRecursive(head);
            long endTime = System.currentTimeMillis();
            return endTime - startTime;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        
        for (int i = 1; i <= 10; i++) {
            linkedList.addNode(i);
        }

        System.out.println("Linked List:");
        linkedList.printIterative();

        System.out.println("Time taken by iterative approach: " + linkedList.calculateIterativeTime() + " nanoseconds");
        System.out.println("Time taken by recursive approach: " + linkedList.calculateRecursiveTime() + " nanoseconds");

        if (linkedList.calculateIterativeTime() < linkedList.calculateRecursiveTime()) {
            System.out.println("Iterative approach takes less time.");
        } else {
            System.out.println("Recursive approach takes less time.");
        }
    }
}