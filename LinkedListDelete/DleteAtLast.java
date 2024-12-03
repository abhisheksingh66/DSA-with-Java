package LinkedListDelete;

public class DleteAtLast {
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

    void DeletLast() {
        if (head == null) {
            System.out.println("The list is already empty.");
            return;
        } else {
            Node curNode = head;
            while (curNode.next.next != null) {
                curNode = curNode.next;

            }
            curNode.next = null;
        }
    }
    // public void deleteLast() {
    // if (head == null) {
    // System.out.println("The list is already empty.");
    // return;
    // }

    // // Traverse to the second-to-last node
    // Node current = head;
    // while (current.next.next != null) {
    // current = current.next;
    // }

    // // Set the second-to-last node's next to null
    // current.next = null;
    // }

    public static void main(String[] args) {
        DleteAtLast d1 = new DleteAtLast();
        d1.insertAtBeginning(10);
        d1.insertAtBeginning(20);
        d1.insertAtBeginning(30);
        d1.insertAtBeginning(40);
        d1.insertAtBeginning(50);
        System.out.println("Before deleting");
        d1.display();
        System.out.println("After dleleting");
        d1.DeletLast();
        // d1.deleteLast();
        d1.display();

    }
}
