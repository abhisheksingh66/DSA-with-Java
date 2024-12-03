package ReverseLinkedList.Queue;

public class CircularQueue1 {
    private int front, rear, capacity;
    private int queue[];
    private int size;

    public CircularQueue1(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = data;
            size++;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity; // Calculate the correct index in circular manner
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int data = queue[front];
        front = (front + 1) % capacity; // Move front forward in a circular manner
        size--;
        return data;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        CircularQueue1 c1 = new CircularQueue1(5);
        c1.enqueue(10);
        c1.enqueue(20);
        c1.enqueue(30);
        c1.enqueue(40);
        c1.enqueue(50);
        c1.display();
        System.out.println("Current queue size: " + c1.getSize());

        System.out.println("Dequeued element: " + c1.dequeue());
        System.out.println("Dequeued element: " + c1.dequeue());
        System.out.println("Dequeued element: " + c1.dequeue());
        System.out.println("Dequeued element: " + c1.dequeue());
        System.out.println("Dequeued element: " + c1.dequeue());
        // c1.display();
        System.out.println("Current queue size: " + c1.getSize());

        c1.enqueue(60);
        c1.enqueue(70);
        c1.display();
        System.out.println("Current queue size: " + c1.getSize());
    }
}
