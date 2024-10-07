import StackLinkedList.Node;

public class QueueStack {
    
 private QueueStack s1;

QueueStack s2;
private Node top;
 // Constructor
 QueueStack() {
 QueueStack s1 = new QueueStack();
  QueueStack s2 = new QueueStack();
 }
 // Enqueue an item to the queue
 public void enqueue(int data)
 {
    s1.push(data);
  }
   private void push(int data) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'push'");
}
public int dequeue()
 {
    if(s1.)
    

    while (!isEmpty) {
        
    }


 



 }
 public static void main(String[] args) {
 int[] keys = { 1, 2, 3, 4, 5 };
 QueueStack q = new QueueStack();
 // insert above keys
 for (int key : keys) {
 q.enqueue(key);
 }
 System.out.println(q.dequeue()); // print 1
 System.out.println(q.dequeue()); // print 2
 }
public QueueStack getS1() {
    return s1;
}
public void setS1(QueueStack s1) {
    this.s1 = s1;
}
public QueueStack getS2() {
    return s2;
}
public void setS2(QueueStack s2) {
    this.s2 = s2;
}
} 
    
