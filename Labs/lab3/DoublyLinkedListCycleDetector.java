public class DoublyLinkedListCycleDetector {

    class DoublyListNode {
        int value;
        DoublyListNode next;
        DoublyListNode prev;

        DoublyListNode(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    public boolean hasCycle(DoublyListNode head) {
        if (head == null) {
            return false;
        }

        DoublyListNode slow = head;
        DoublyListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move slow pointer by 1 step
            fast = fast.next.next; // Move fast pointer by 2 steps

            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle
    }

    public static void main(String[] args) {
        DoublyLinkedListCycleDetector detector = new DoublyLinkedListCycleDetector();
        DoublyListNode node1 = detector.new DoublyListNode(1);
        DoublyListNode node2 = detector.new DoublyListNode(2);
        DoublyListNode node3 = detector.new DoublyListNode(3);
        DoublyListNode node4 = detector.new DoublyListNode(4);

        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        node3.next = node3;
        node4.prev = node3;
        node4.next = node2; // Creates a cycle

        boolean hasCycle = detector.hasCycle(node1);
        System.out.println("The doubly linked list contains a cycle: " + hasCycle);}
}
