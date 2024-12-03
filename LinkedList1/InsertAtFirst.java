package LinkedList1;

public class InsertAtFirst {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

  
    void display() {
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    void insertAtBeginning(int data) {
        Node newnNode = new Node(data);
        if (head == null) {
            head = newnNode;
            return;
        } else {
            newnNode.next = head;
            head = newnNode;
        }
    }



    // boolean search(int key){
    //     Node cuNode=head;
    // while (cuNode!=null) {
    //     if (cuNode.data==key) {
    //         return true;
    //     }
    //     cuNode=cuNode.next;
        
    // }
    //  }
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


    public static void main(String[] args) {
        InsertAtFirst l1 = new InsertAtFirst();
        l1.insertAtBeginning(10);
        l1.insertAtBeginning(20);
        l1.insertAtBeginning(30);
        l1.insertAtBeginning(40);
        l1.display();


         // Searching for a value in the LinkedList
         boolean found = l1.search(10);  // Output: true
         System.out.println("Is 10 present? " + found);
         l1.display();
    }
}
