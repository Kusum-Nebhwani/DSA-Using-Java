package BinarySearchTree;

public class LargestBSTreeInBinaryTree {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;

        }
    }

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int min, int max, int size) {
            this.isBST = isBST;
            this.max = max;
            this.min = min;
            this.size = size;
        }
    }

    public static int maxBST = 0;

    public static Info largestBST(Node root) {
        //base case
        if (root == null) {
            return new Info(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        //size
        int size = leftInfo.size + rightInfo.size + 1;
        //min
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        //max
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
        //isBst
        if (root.data <= leftInfo.max || rightInfo.min <= root.data) {
            return new Info(false, min, max, size);
        }

        if (leftInfo.isBST && rightInfo.isBST) {
            maxBST = Math.max(maxBST, size);
            return new Info(true, min, max, size);
        }

        return new Info(false, min, max, size);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);


        /*
              50
          /       \
         30       60
        /  \     /  \
       5    20  45   70
                   /  \
                  65   80

         */
        Info i = largestBST(root);
        System.out.println("largest BST size: " + maxBST);

        }

    }
