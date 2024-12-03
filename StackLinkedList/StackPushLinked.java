package StackLinkedList;

public class StackPushLinked {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    private Node top;

    public StackPushLinked(Node top) {
        this.top = null;
    }

    boolean isEmpty() {
        return top == null;
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed " + data + " onto the stack.");
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Node cuNode = top;
        while (cuNode != null) {
            System.out.print(cuNode.data + " -> ");
            cuNode = cuNode.next;
        }
        System.out.println("NULL");
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;

        }
        int popdata = top.data;
        top = top.next;
        System.out.println("Popped " + popdata + " from the stack.");
        return popdata;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return top.data;
    }

    public void pushAtBottom(int value) {
        if (isEmpty()) {
            push(value); // If stack is empty, push directly
        } else {
            // Pop the top element
            int temp = pop();
            // Recursive call to push at the bottom
            pushAtBottom(value);
            // Push the popped element back on top
            push(temp);
        }
    }

    void reverseStack(){
        if (!isEmpty()) {
            int temp=pop();
            reverseStack();
            pushAtBottom(temp);
        }
    }


    public static void main(String[] args) {
        StackPushLinked st = new StackPushLinked(null);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();

        // st.pop();
        // st.pop();
        st.display();
        // st.peek();
        System.out.println("Top element is " + st.peek());


        st.reverseStack();
        System.out.println("Reversed Stack:");
        st.display();
    }
}
