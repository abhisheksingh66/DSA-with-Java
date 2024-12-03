package BinaryTree1;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class TreeInoder {
  
    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }


    public static void main(String[] args) {

        Node p = new Node(4);
        Node p1 = new Node(1);
        Node p2 = new Node(6);
        Node p3 = new Node(5);
        Node p4 = new Node(2);

        p.left = p1;
        p.right = p2;
        p1.left = p3;
        p1.right = p4;

        TreeInoder t1=new TreeInoder();
        System.out.print("Pre-order traversal: ");
        t1.preOrder(p);
    }
}
