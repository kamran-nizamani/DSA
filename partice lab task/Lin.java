class Lin {
    Node head;
    class  Node{
        int data;
        Node next;
        public void Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public void add(int data){
            Node newNode=new Node();
            if(head==null){
                newNode.next = head;
                head = newNode;

        }
        public  void printList(){
            Node temp=head;
            while (temp.next!=null) {
                temp=temp.next;

                
            }
            temp.next=temp;
            

        }
        public static void main(String[] args) {
            Lin Li=new Lin();
            Li.add(6);
            Li.add(0);
            Li.add(8);
            Li.printList();

        }
    
}