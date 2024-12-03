package LinkedList1;

// import LinkdeList.InsertAtLast;

public class InssertAtLast {
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
        Node cuNode = head;
        while (cuNode != null) {
            System.out.print(cuNode.data + " -> ");
            cuNode = cuNode.next;
        }
        System.out.println("NULL");
    }

    void addFirst(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void InsertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node cuNode = head;
            while (cuNode.next != null) {
                cuNode = cuNode.next;
            }
            cuNode.next = newNode;
        }

    }

    public static void main(String[] args) {
        InssertAtLast l1 = new InssertAtLast();
        l1.addFirst(10);
        l1.addFirst(20);
        l1.addFirst(30);
        l1.addFirst(40);
        l1.addFirst(50);
        l1.InsertAtLast(90);
        l1.display();




    }
}
