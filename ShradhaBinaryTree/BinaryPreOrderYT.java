package ShradhaBinaryTree;

public class BinaryPreOrderYT {

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


    static class BinaryTree{
        static int indx=-1;
        public static Node buildTree(int[] nodes){
           indx++;
           if (nodes[indx]==-1) {
            return null;
           }
           Node newNode = new Node(nodes[indx]);
           newNode.lefNode = buildTree(nodes);
           newNode.riNode = buildTree(nodes);
           return newNode;
        }

    }

    public static void preorderTraversal(Node root){
        if (root!=null) {
            System.out.print(root.data + " ");
            preorderTraversal(root.lefNode);
            preorderTraversal(root.riNode);

        }


    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root=BinaryTree.buildTree(nodes);
        System.out.println("Root Node Data: " + root.data);
        preorderTraversal(root);
    }
}
