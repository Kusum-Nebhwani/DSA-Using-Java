package BinarySearchTree;

import BinaryTree.BuildTreeAndTreeTraversals;

import java.util.ArrayList;

public class ConvertBSTtoBalancedTree {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;

        }
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
       getInorder(root.left,inorder);
        inorder.add(root.data);
        getInorder(root.right,inorder);
    }

    public static Node createBst(ArrayList<Integer> inorder,int si,int ei){
        if(si>ei){
            return null;
        }

        int mid = (si+ei)/2;

        Node root = new Node(inorder.get(mid));
        root.left = createBst(inorder,si,mid-1);
        root.right = createBst(inorder,mid+1,ei);

        return root;
    }
    public static Node balancedBST(Node root){
        //get inorder sequence
       ArrayList<Integer> inorder = new ArrayList<>();
       getInorder(root,inorder);


       //sorted inorder --> balanced bst
        root = createBst(inorder,0,inorder.size()-1);


         return root;
    }
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
          /*
              8
             / \
           6    10
          /       \
         5          11
        /            \
       3              12





             */

        Node root = new Node(8);
        root.left = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root = balancedBST(root);
        preorder(root);

          /*
             8
            /  \
           5    11
          / \   / \
         3   6  10 12


         expected BST */



    }
}
