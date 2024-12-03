package ReverseLinkedList.Queue;

public class QueueEndue {

    private int front, rear, capacity;
    private int queue[];
    // private int sizess;

    public QueueEndue(int capacity) {
        front = rear = 0;
        this.capacity = capacity;
        queue = new int[capacity];
        // sizess = 0;
    }

    boolean isFull() {
        return rear == capacity;
    }

    boolean isEmpty() {
        return front == rear;
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        } else {
            queue[rear++] = data;
            // sizess++;
        }

    }

    int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            int val = queue[front];
            front++;
            // sizess--;
            return val;

        }
    }

    // public int getSizess() {
    //     return sizess;
    // }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        return queue[front];
    }

    public void display() {
        // if (front == rear) {
        // System.out.println("Queue is empty");
        // return;
        // }
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueEndue q1 = new QueueEndue(5);
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        // q1.enqueue(50);
        q1.display();

        // q1.deQueue();
        // System.out.println("Dequeued element: " + q1.deQueue());
        // System.out.println("Dequeued element: " + q1.deQueue());
        // System.out.println("Dequeued element: " + q1.deQueue());
        // System.out.println("Dequeued element: " + q1.deQueue());
        // System.out.println("Dequeued element: " + q1.deQueue());
        // System.out.println("Dequeued element: " + q1.deQueue());
        q1.display();
        // System.out.println("Current queue size: " + q1.getSizess());
        System.out.println("Front element is: " + q1.peek());
        // System.out.println("Current queue size: " + q1.getSizess());
        // q1.enqueue(30);
        // q1.enqueue(40);
        // q1.display();
    }
}
