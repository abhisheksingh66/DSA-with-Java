package LinkedListQueue;

public class LinkedListDeque {


    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front, rear;
    int size;

    public LinkedListDeque() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    boolean isEmpty() {
        return front == null;
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

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Dequeued element: " + front.data);
        front = front.next;

        if (front == null) { // If queue becomes empty
            rear = null;
        }
        size--;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        LinkedListDeque l1=new LinkedListDeque();
        l1.enqueue(10);
        l1.enqueue(20);
        l1.enqueue(30);
        l1.enqueue(40);
        l1.enqueue(50);
        l1.display();
        System.out.println("Current size is : " + l1.getSize());


    }
}
