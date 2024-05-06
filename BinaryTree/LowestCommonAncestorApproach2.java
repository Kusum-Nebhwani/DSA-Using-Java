package BinaryTree;

public class LowestCommonAncestorApproach2 {
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
    public static Node lca2 (Node root,int n1,int n2){
        if(root==null||root.data==n1||root.data==n2){
            return root;
        }

        Node leftLCA = lca2(root.left,n1,n2);
        Node rightLCA = lca2(root.right,n1,n2);

        if(rightLCA == null){
            return leftLCA;
        }
        if(leftLCA == null){
            return rightLCA;
        }
        return root;
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
             System.out.println(lca2(root,4,6).data);

        }
}
