package LinkedListQueue;

import LinkedList1.newnNode;

public class LinkedListEnque {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int getSize() {
        return size;
    }

    Node front, rear;
    int size;

    public LinkedListEnque() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return front == null && rear == null;
    }

    void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;

        } else {

            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;

            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedListEnque l1 = new LinkedListEnque();
        l1.enqueue(10);
        l1.enqueue(20);
        l1.enqueue(30);
        l1.enqueue(40);
        l1.enqueue(50);
        l1.display();
        System.out.println("Current size is : " + l1.getSize());

    }
}
