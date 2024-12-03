package CircularQueue;

public class QueueEnquue {
 
    int front,rear,capacity;
    int queue[];
    int size;

   

    public QueueEnquue(int capacity) {
        this.capacity = capacity;
        front=rear=-1;
        queue=new int[capacity];
        size=0;
    }
    public int getSize() {
        return size;
    }
     boolean  isFull(){
       return (rear+1)%capacity==front;
       }

       boolean isEmpty(){
        return front==-1;
       }

        void enqueue(int data){
            // if (isFull()) {
            //     System.out.println("Queue is full");
            //      return;
                
            // }else{
            //     // rear=(rear+1)%capacity;
            //     rear = (rear + 1) % capacity;
            //     queue[rear] = data;
            //     size++;
            // }
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            // Check if queue is initially empty
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % capacity;
            }
            queue[rear] = data;
            size++;
        }

        void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.println("Dequeued element: " + queue[front]);
            if (front == rear) { // Queue becomes empty after dequeue
                front = rear = -1;
            } else {
                front = (front + 1) % capacity;
            }
            size--;
        }

        int peek(){
            if (isEmpty()) {
                System.out.println("Queue is empty. Nothing to peek.");
                return -1;
            }
            return queue[front];
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

        
    public static void main(String[] args) {
        QueueEnquue q1=new QueueEnquue(5);
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.display();

        System.out.println("Front element is: " + q1.peek());
        System.out.println("Current queue size is : " + q1.getSize());
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        System.out.println("Front element is: " + q1.peek());
        System.out.println("Current queue size is : " + q1.getSize());

        q1.enqueue(60);
        q1.enqueue(60);
        System.out.println("Front element is: " + q1.peek());
        System.out.println("Current queue size is : " + q1.getSize());
        // System.out.println("Dequeue");


    }
}
