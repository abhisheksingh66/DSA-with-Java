package BinaryTree;

import LinkedList1.newnNode;

public class TreeInorder {
    Node root;

    public TreeInorder() {
        root = null;
    }

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    public void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void PostOrderTraversal(Node node) {
        if (node != null) {
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }
    public void preOrder() {
        preOrderTraversal(root);
    }
    public void postOrder() {
        PostOrderTraversal(root);
    }
    public static void main(String[] args) {

        TreeInorder tree = new TreeInorder();
        // tree.insert(50);
        // tree.insert(30);
        // tree.insert(20);
        // tree.insert(40);
        // tree.insert(70);
        // tree.insert(60);
        // tree.insert(80);



        tree.insert(1);
        tree.insert(2);
        tree.insert(4);
        tree.insert(5);
        tree.insert(3);
        tree.insert(6);
        // tree.insert(3);
       

        System.out.print("\nPre-order traversal: ");
        tree.preOrder();

        System.out.print("\nPost-order traversal: ");
        tree.postOrder();
    }
}
