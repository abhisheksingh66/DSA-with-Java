package LinkedListDelete;

public class DelteatIndex {

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

    void display() {
        Node cuNode = head;
        while (cuNode != null) {
            System.out.print(cuNode.data + " -> ");
            cuNode = cuNode.next;
        }
        System.out.println("NULL");
    }

    void DelteAtIndex(int index) {
        if (head == null) {
            System.out.println("The list is already empty.");
            return;
        }

        int i = 0;
        Node currNode = head;
        while (i != index - 1) {
            currNode = currNode.next;
            i++;
        }
        currNode.next = currNode.next.next;
    }

    public static void main(String[] args) {
        DelteatIndex d1 = new DelteatIndex();
        d1.insertAtBeginning(10);
        d1.insertAtBeginning(20);
        d1.insertAtBeginning(30);
        d1.insertAtBeginning(40);
        d1.insertAtBeginning(50);
        d1.display();
        d1.DelteAtIndex(2);
        d1.display();

    }
}
