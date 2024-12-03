package ShradhaBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import LinkedList1.newnNode;

public class BinaryInOrderYT {

    static class Node {
        int data;
        Node lefNode;
        Node riNode;

        public Node(int data) {
            this.data = data;
            lefNode = null;
            riNode = null;
        }

    }

    static class binaryTree {
        static int indx = -1;

        public static Node InbuildTree(int[] nodes) {
            indx++;
            if (nodes[indx] == -1) {
                return null;

            }
            Node newNode = new Node(nodes[indx]);
            newNode.lefNode = InbuildTree(nodes);
            newNode.riNode = InbuildTree(nodes);
            return newNode;
        }

    }

    public static void inOrederTraversal(Node root) {
        if (root != null) {
            inOrederTraversal(root.lefNode);
            System.out.print(root.data + " ");
            inOrederTraversal(root.riNode);

        }
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;

        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node cuNode = q.remove();
            if (cuNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;

                } else {
                    q.add(null);
                }
            } else {
                System.out.print(cuNode.data + " ");
                if (cuNode.lefNode != null) {
                    q.add(cuNode.lefNode);

                }
                if (cuNode.riNode != null) {
                    q.add(cuNode.riNode);

                }
            }

        }

    }

    // public void levelOrder() {
    // if (root == null) {
    // return;
    // }

    // Queue<Node> queue = new LinkedList<>();
    // queue.add(root);

    // while (!queue.isEmpty()) {
    // Node current = queue.poll();
    // System.out.print(current.data + " ");

    // if (current.left != null) {
    // queue.add(current.left);
    // }

    // if (current.right != null) {
    // queue.add(current.right);
    // }
    // }
    // }

    public static int countNode(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = countNode(root.lefNode);
        int rightNode = countNode(root.riNode);
        return leftNode + rightNode + 1;

    }

    public static int sumNode(Node root) {
        if (root == null) {
            return 0;
        }
        int leftsum = sumNode(root.lefNode);
        int rightsum = sumNode(root.riNode);
        return leftsum + rightsum + root.data;

    }

    public static int heightOfNode(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = heightOfNode(root.lefNode);
        int rightHeight = heightOfNode(root.riNode);
        // return leftHeight+rightHeight +root.data;
        int height = Math.max(leftHeight, rightHeight) + 1;
        return height;

    }

    public static int diameterOfTree(Node root) {
        if (root == null) {
            return 0;

        }
        int diLeft = diameterOfTree(root.lefNode);
        int diRight = diameterOfTree(root.riNode);
        int height = heightOfNode(root.lefNode) + heightOfNode(root.riNode) + 1;
        return Math.max(height, Math.max(diLeft, diRight));
    }

    static class TreeInfo {
        int ht;
        int diam;

        public TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root){
        TreeInfo left=diameter2(root.lefNode);
        TreeInfo right=diameter2(root.riNode);
        int myHeight=Math.max(left.ht, right.ht)+1;
        int dia1=left.diam;
        int dia2=right.diam;


    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = binaryTree.InbuildTree(nodes);
        System.out.println("Root node data : " + root.data);
        // inOrederTraversal(root);
        levelOrder(root);
        System.out.println("Total number of nodes : " + countNode(root));
        System.out.println("Sum of nodes : " + sumNode(root));
        System.out.println("Height of nodes : " + heightOfNode(root));
        // System.out.println("Diameter of NodeTree is : " + diameterOfTree(root));
        System.out.println("Diameter of NodeTree  is : " + dia);
    }
}
