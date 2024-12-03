package ReverseLinkedList.StackArray;

public class StackPush {
        private int size;
        private int top;
        private int arr[];

        public StackPush(int size) {
            this.size = size;
            this.top = -1;
            this.arr = new int[size];
        }

        
    boolean isFull(){
        return top==size-1;
    }

    
    boolean isEmpty(){
        return top==-1;
    }

    void push(int value){
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        }else{
            arr[++top]=value;
        }
     
    }


    int pop(){
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to pop.");
            return -1;
        }else{
            return arr[top--];
        }
    }
    
   
int peek(){
    if (isEmpty()) {
        System.out.println("Stack is empty. Nothing to peek.");
        return -1;
    }else{
        return arr[top];
    }
}

    public static void main(String[] args) {
      StackPush st=new StackPush(5);
      System.out.println("Stack has been created successfully");
      st.push(10);
      st.push(20);
      st.push(30);
      st.push(40);
      System.out.println("Top element is: " + st.peek());

      System.out.println("Popped element: " + st.pop());
        System.out.println("Top element after pop is: " + st.peek());

        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        while (!st.isEmpty()) {
            System.out.println("Popped element: " + st.pop());
        }
    }
}
