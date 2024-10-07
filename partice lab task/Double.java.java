

class Double{
    class Node {
        int data;
        Node prev;
        Node next;
        public Node(int data ){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
        }
    Node head;
    void AddFirs(int data){
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
        }
        else{
            n.next=head;
            head.prev=n;
            head=n;
        }
    }


    void addlast(int data){
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
        }
        temp.next=n;
        n.prev=temp;
        }
    }
    void addMide(int data ,int pos){
        



        Node n=new Node(data);
        int i=0;
        if(head==null){
            head=n;
            
        } 
        
    else {
        Node temp = head;
        while (i<pos-1) {


            temp = temp.next;

            
    i++;
            }
            n.next=temp.next;
            temp.next=n;
            n.prev=temp;



    }





    }
    void printList(){
        Node temp = head;
        while (temp.next!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;

            
        }
    }

public static void main(String[] args) {
    Double d=new Double();
    d.AddFirs(10);
    d.addlast(7);
    d.AddFirs(6);
    d.addMide(2, 1);
    d.printList();



}








}


