package BinarySearchTree;

import BinaryTree.BuildTreeAndTreeTraversals;

public class MirrorBST {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;

        }
    }
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node createMirror(Node root){
        if(root == null){
            return null;
        }

        Node leftMirror =  createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    public static void main(String[] args) {


           /*
              8
             / \
           5    10
          / \     \
         3   6     11
        / \          \
       1   4           14





             */

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);

        createMirror(root);
        preorder(root);
    }
}
