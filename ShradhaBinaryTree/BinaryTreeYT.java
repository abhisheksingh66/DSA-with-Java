package ShradhaBinaryTree;

import LinkedList1.newnNode;

public class BinaryTreeYT {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int indx = -1;

        public static Node buildTree(int[] nodes) {
            indx++;
            if (nodes[indx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[indx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }



        public static void preorderTraversal(Node root) {
            if (root == null) {
                return;
            }

            // Visit the root node
            System.out.print(root.data + " ");
            // Traverse the left subtree
            preorderTraversal(root.left);
            // Traverse the right subtree
            preorderTraversal(root.right);
        }
    
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println("Root Node Data: " + root.data);

        System.out.print("Preorder Traversal: ");
        BinaryTree.preorderTraversal(root);
    }
}