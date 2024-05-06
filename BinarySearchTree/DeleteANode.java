package BinarySearchTree;

public class DeleteANode {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;

        }
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);

    }
    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
    public static Node delete(Node root,int n) {
        if (root.data > n) {
            root.left = delete(root.left, n);
        } else if (root.data < n) {
            root.right = delete(root.right, n);
        } else {
            //c1: no child
            if (root.left== null && root.right == null) {
                return null;
            }

            //c2: one child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;

            }

            //c3: two child
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
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

        System.out.print("Before Deletion: ");
        inorder(root);
        System.out.println();

        root = delete(root,5);
        System.out.println();

        System.out.print("After Deletion: ");
        inorder(root);
    }
}
