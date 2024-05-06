package BinaryTree;

public class DiameterOfTreeApproachOne {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){

            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int left_height = height(root.left);
        int right_height = height(root.right);

        return  Math.max(left_height,right_height) + 1;

    }

    public static int diameter(Node root){ // o(n^2)
        if(root == null){
            return 0;
        }
        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int selfDiameter = leftHeight + rightHeight + 1;

        return Math.max(selfDiameter,Math.max(leftDiameter,rightDiameter));

  }
    public static void main(String[] args) {
          /*
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

        System.out.println("Diameter of the tree: " + diameter(root));

    }

}
