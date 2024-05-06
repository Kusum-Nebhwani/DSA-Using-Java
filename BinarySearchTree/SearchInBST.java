package BinarySearchTree;

public class SearchInBST {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;

        }
    }
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data == key){
            return true;
        }

        if(root.data > key){
             return search(root.left,key);

        }else{
            return search(root.right,key);
        }
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

            if(search(root,7)){
                System.out.println("key found!");
            }else{
                System.out.println("key not found!");
            }


        }
    }
