package Bst;

import LinkedList1.newnNode;

public class BuildBinaryTree {

    static class Node {
        int data;
        Node lefNode;
        Node riNode;

        public Node(int data) {
            this.data = data;
            this.lefNode = null;
            this.riNode = null;
        }

    }

    public static Node insert(Node root, int value) {

        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value<root.data) {
            root.lefNode = insert(root.lefNode, value);

        } else {
            root.riNode = insert(root.riNode, value);
        }

        return root;
    }

    // Node insertRec(Node root, int value) {

    // if (root == null) {
    // root = new Node(value);
    // return root;
    // }
    // if (value < root.data)
    // root.lefNode = insertRec(root.lefNode, value);
    // else if (value > root.data)
    // root.riNode = insertRec(root.riNode, value);

    // return root;
    // }

    static void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.lefNode);
            System.out.print(root.data + " ");
            inorderRec(root.riNode);
        }
    }


    public static boolean searchTree(Node root,int key){
        if (root==null) {
            return false;
        }

        if (root.data==key) {
            return true;
        }

        if (key<root.data) {
            return searchTree(root.lefNode, key);
            
        }else{
            return searchTree(root.riNode, key);
        }

    }

    static Node delNode(Node root,int key){
          if (root==null) {
            return root;
            
          }

          if (key<root.data) {
               root.lefNode=   delNode(root.lefNode, key);
            
          }else if(key>root.data){
            root.riNode= delNode(root.riNode, key);
          }else{
            if (root.lefNode==null && root.riNode==null) {
                return null;
                
            }
            if (root.lefNode==null) {
                return root.riNode;
            }else{
                return root.lefNode;
            }

Node IS=inOrderSucceser(root.riNode);

          }

    }

    static Node inOrderSucceser(){

    }
    

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorderRec(root);
        System.out.println();

        if (searchTree(root, 4)) {
            System.out.println("Found->>>>>>");
            
        }else{
            System.out.println("Not Found->>>>>>");
        }
    }
}
