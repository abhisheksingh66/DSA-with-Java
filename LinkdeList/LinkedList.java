package LinkdeList;
public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


      // Method to insert a new node at the beginning
      public void insertAtBeginning(int data) {
       Node newnode=new Node(data);
       newnode.next=head;
       head=newnode;

    }


    public void display(){
        Node currNode=head;
        while (currNode!=null) {
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
        
    }



    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.insertAtBeginning(44);
        l1.insertAtBeginning(55);
        System.out.println("Linked List after insertions:");
        l1.display();


    }
}
