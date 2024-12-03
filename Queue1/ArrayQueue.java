package Queue1;

public class ArrayQueue {
    int front, rear, capacity;
    int queue[];
    int size;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        front = rear = 0;
        queue = new int[capacity];
        size = 0;
    }

    boolean isFull() {
        return rear == capacity;
    }

    boolean isEmpty(){
        return front==rear;
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



    public static void main(String[] args) {
         ArrayQueue q1=new ArrayQueue(5);
         q1.enqueue(10);
         q1.enqueue(20);
         q1.enqueue(30);
         q1.enqueue(40);
         q1.enqueue(50);
         q1.display();
     
         
    }
}
