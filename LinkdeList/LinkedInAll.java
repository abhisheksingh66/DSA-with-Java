package LinkdeList;

public class LinkedInAll {
Node head;
class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
    

// void insertAtBeginning(int data){
//     Node newNode=new Node(data);
//     if (head==null) {
//         head=newNode;
//         return;
//     }
//         newNode.next=head;
//         head =newNode;
    
// }
   
public void insertAtBeginning(int data) {
    Node newnode=new Node(data);
    newnode.next=head;
    head=newnode;

 }


void InsertLast(int data){
    Node newNode=new Node(data);
    if (head==null) {
        head=newNode;
        return;
    }else{
        Node cuNode=head;
        while (cuNode.next!=null) {
            cuNode=cuNode.next;
        }
        cuNode.next=newNode;
    }
}


// void InsertLast(int data){
//     Node newnode=new Node(data);
//     if(head==null){
//          head=newnode;
//          return;
//     }else{
//         Node cuNode=head;
//         while (cuNode.next!=null) {
//             cuNode=cuNode.next;
//         }
//         cuNode.next=newnode;
//     }
//  }


void display(){
    Node cuNode=head;
    while (cuNode!=null) {
        System.out.print(cuNode.data + " -> ");
        cuNode =cuNode.next;
    }
    System.out.println("null");
}



    public static void main(String[] args) {
        LinkedInAll l1=new LinkedInAll();
        l1.InsertLast(10);
        l1.InsertLast(20);
        l1.InsertLast(30);
        l1.InsertLast(40);
        l1.display();
        l1.insertAtBeginning(50);
        System.out.println("Linked List after insertions:");
        l1.display();
    }
}
