package BinarySearchTree;

public class PrintInRange {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;

        }
    }
    public static void printInRange(Node root,int k1,int k2){
        if(root == null){
            return;
        }

        //case 1
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.data + " ");
            printInRange(root.right,k1,k2);
        }

        //case 2
        else if(root.data < k1){
            printInRange(root.left,k1,k2);
        }

        //case 3 --> root.data > k2
        else{
            printInRange(root.right,k1,k2);
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


        printInRange(root,6 ,10);
    }
}
