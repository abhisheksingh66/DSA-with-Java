package LinkdeList;

// import LinkdeList.LinkedList.Node;

public class InsertAtLast {
    Node head;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


     void InsertLast(int data){
        Node newnode=new Node(data);
        if(head==null){
             head=newnode;
        }else{
            Node cuNode=head;
            while (cuNode.next!=null) {
                cuNode=cuNode.next;
            }
            cuNode.next=newnode;
        }
     }



    void display(){
        Node cuNode=head;
        while (cuNode!=null) {
            System.out.print(cuNode.data + " -> ");
            cuNode=cuNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertAtLast l1=new InsertAtLast();
        l1.InsertLast(55);
        l1.InsertLast(60);
        l1.InsertLast(70);
        l1.display();
    }
}
