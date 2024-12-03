package ReverseLinkedList;

public class ReverseList {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }


void ReverseLinkedList(){
    Node prNode=null;
    Node cuNode=head;
    Node next=null;

    while (cuNode!=null) {
        next=cuNode.next;
        cuNode.next=prNode;
        prNode=cuNode;
        cuNode=next;
        
    }
    head=prNode;
}






    void display() {
        Node cuNode = head;
        while (cuNode != null) {
            System.out.print(cuNode.data + " -> ");
            cuNode = cuNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        ReverseList d1=new ReverseList();
        d1.insertAtBeginning(10);
        d1.insertAtBeginning(20);
        d1.insertAtBeginning(30);
        d1.insertAtBeginning(40);
        d1.insertAtBeginning(50);
        System.out.println("Before deleting");
        d1.display();
        d1.ReverseLinkedList();
        System.out.println("Reversed Linked List:");
        d1.display();
    }
}
