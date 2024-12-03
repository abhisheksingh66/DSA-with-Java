package Queue1;

import LinkedList1.newnNode;

public class ArrayDequeue {

    int front,rear,capacity;
    int queue[];
    int size;

    public ArrayDequeue(int capacity) {
        this.capacity = capacity;
        front=rear=0;
        size=0;
        queue=new int[capacity];
    }



boolean isFull(){
    return rear==capacity;

}

boolean isEmpty(){
    return rear==front;
}


void enqueue(int data){
    if (isFull()) {
        System.out.println("Queue is full");
        return;
    }else{
        queue[rear++]=data;
        size++;
    }

}

    void display(){
        for(int i=front;i<rear;i++){
            System.out.print(queue[i] + " ");

        }
        System.out.println();
    }
 
    int peek(){
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        return queue[front];
    }
    public int getSize() {
        return size;
    }

    int deQueue(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }else{
            int val=queue[front];
            front++;
            size--;
            return val;
            
        }
    }

    


    public static void main(String[] args) {
        ArrayDequeue a1=new ArrayDequeue(5);
        a1.enqueue(10);
        a1.enqueue(20);
        a1.enqueue(30);
        a1.enqueue(40);
        a1.enqueue(50);
        a1.display();
        System.out.println("Front element is: " + a1.peek());
        System.out.println("Current queue size is : " + a1.getSize());

        System.out.println("Dequeued element: " + a1.deQueue());
        System.out.println("Dequeued element: " + a1.deQueue());
        System.out.println("Dequeued element: " + a1.deQueue());
        System.out.println("Front element is: " + a1.peek());
        System.out.println("Current queue size is : " + a1.getSize());

    }
}
