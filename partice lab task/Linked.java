class Linked{
    Node head;
    public void AddFisrtNode(int data){
        Node newnode =new Node(data);
    
    if(head==null){
        head = newnode;
        
    }
    newnode.next=head;
    head =newnode;


    
    
    
    
    }
    public void AddLast(int data){


    }

    
    public static void main(String[] args) {
        Linked l =new Linked();
        l.AddFisrtNode(4);
        l.AddFisrtNode(6);
    }


    
}