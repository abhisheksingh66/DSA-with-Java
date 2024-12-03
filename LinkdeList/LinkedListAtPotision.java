package LinkdeList;

public class LinkedListAtPotision {

    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void Display() {
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

    void addIndex(int data, int index) {
        Node newnNode = new Node(data);
        Node curNode = head;
        if (index == 0) {
            addFirst(data);
            return;

        } else {
            int i = 0;
            while (i != index - 1) {
                curNode = curNode.next;
                i++;
            }
        }
        newnNode.next = curNode.next;
        curNode.next = newnNode;
    }

    public static void main(String[] args) {
        LinkedListAtPotision l1 = new LinkedListAtPotision();
        l1.addFirst(10);
        l1.addFirst(20);
        l1.addFirst(30);
        l1.addFirst(40);
        l1.addFirst(50);
    
        l1.Display();

        l1.addIndex(99, 2);
         System.out.println("After inserting ");
        l1.Display();
    }
}
