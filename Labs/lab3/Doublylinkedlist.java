public class Doublylinkedlist {
    Node head;

    void addfirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }}

    void addlast(int data){
        Node newnode=new Node(data);
        Node temp=head;
        if(head==null){
            head=newnode;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.prev=temp;
        }

    }
    
    int  deletefirst(){
        if(head==null){
            return -1;}
            else{
                int data=head.data;
                head=head.next;
                return data;
            }

}
    int deletelast(){
    Node temp = head;
    if(head == null){
        return -1;
    } else if(head.next == null){
        int data = head.data;
        head = null;
        return data;
    } else {
        while(temp.next.next != null){
            temp = temp.next;
        }
        int data = temp .next.data;
        temp.next = null;
        return data;
    }
      void  printlist(){  
        Node temp = head;
        while (temp.next!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;

            
        }




        }


    
    
        public static void main(String[] args) {
            Doublylinkedlist dl = new Doublylinkedlist();
            dl.addFirst(7);
            dl.addFirst(1);
            dl.addFirst(4);
            System.out.println("Deleted first: " + dl.deleteFirst());
            System.out.println("Deleted last: " + dl.deleteLast());
            System.out.print("Current list: ");
            dl.printList();
        }
    }