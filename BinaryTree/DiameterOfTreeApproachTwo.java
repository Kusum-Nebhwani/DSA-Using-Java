package BinaryTree;

public class DiameterOfTreeApproachTwo {
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
    static class Info{
        int ht;
        int dia;

        public Info(int dia,int ht){
            this.dia = dia;
            this.ht = ht;

        }
    }
    public static Info diameter(Node root){ //o(n)
        if(root == null){
            return new Info(0,0);
        }
      Info leftInfo = diameter(root.left);
      Info rightInfo = diameter(root.right);

      int final_diameter = Math.max(Math.max(leftInfo.dia , rightInfo.dia), leftInfo.ht + rightInfo.ht+1);
      int final_height = Math.max(leftInfo.ht,rightInfo.ht) + 1;

      return new Info(final_diameter,final_height);
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

        System.out.println("Diameter of the tree: " +diameter(root).dia);
        System.out.println("height of the tree: " + diameter(root).ht);

    }
}
