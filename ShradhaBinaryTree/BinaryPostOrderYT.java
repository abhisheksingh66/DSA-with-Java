package ShradhaBinaryTree;

public class BinaryPostOrderYT {
    static class Node {
        int data;
        Node lefNode;
        Node rigNode;

        public Node(int data) {
            this.data = data;
            this.lefNode = null;
            this.rigNode = null;
        }
    }

    static class InnerBinary {
        static int indx = -1;

        public static Node buildTree(int[] nodes) {
            indx++;
            if (nodes[indx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[indx]);
            newNode.lefNode = buildTree(nodes);
            newNode.rigNode = buildTree(nodes);
            return newNode;
        }

    }

    public static void postorderTraversal(Node root) {
        if (root != null) {
            postorderTraversal(root.lefNode);
            System.out.print(root.data + " ");
            postorderTraversal(root.rigNode);
        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = InnerBinary.buildTree(nodes);
        System.out.println("Root node data : " + root.data);
        postorderTraversal(root);

    }
}
