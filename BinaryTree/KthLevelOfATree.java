package BinaryTree;

public class KthLevelOfATree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {

            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void kLevel(Node root,int level,int K){
        if(root == null){
            return;
        }
        if(level == K){
            System.out.print(root.data + " ");
            return;
        }
        kLevel(root.left, level+1, K);
        kLevel(root.right,level+1,K);
    }
    public static void main(String[] args) {
         /* tree
              1
             / \
            2   3
           / \   \
          4   5   6

        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        System.out.print("Kth level: ");
        kLevel(root,1,2);

    }
}
