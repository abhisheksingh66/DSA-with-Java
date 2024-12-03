package LinkdeList;
public class LinkedList1 {

    Node head;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    void insertAtBeginning(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }


void display(){
    Node curNode=head;
    while (curNode!=null) {
        System.out.print(curNode.data + " -> ");
        curNode=curNode.next;
    }
    System.err.println("null");
}

    public static void main(String[] args) {
          LinkedList1 l1=new LinkedList1();
          l1.insertAtBeginning(10);
          l1.insertAtBeginning(20);
          l1.insertAtBeginning(30);
          l1.display();
    }
}
