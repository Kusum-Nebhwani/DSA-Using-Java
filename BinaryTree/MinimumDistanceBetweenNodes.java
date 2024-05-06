package BinaryTree;



public class MinimumDistanceBetweenNodes {
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
    public static Node lca2 (Node root, int n1, int n2){
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
    public static int lcaDist(Node root, int n) {
        if(root == null){
            return -1;
        }
        if(root.data == n ){
            return 0;
        }

        int leftMinDist = lcaDist(root.left,n);
        int rightMinDist = lcaDist(root.right,n);

        if(leftMinDist == -1 && rightMinDist == -1){
            return -1;
        }else if (leftMinDist == -1){
            return rightMinDist + 1;
        }else{
            return leftMinDist + 1;
        }

    }
    public static int minDistance(Node root,int n1,int n2){
        Node lca = lca2(root,n1,n2);
        int dist1 = lcaDist(lca,n1);
        int dist2 = lcaDist(lca,n2);

        return dist1 + dist2;


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

        System.out.println("minimum distance from node 4 and 6: " + minDistance(root,4,6));
    }
}
