package BinaryTree;

public class SubtreeOfAnotherTree {
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
    public static boolean isIdentical(Node node,Node subRoot){
        //the node/root matched with subRoot check if identical or not
        if(node==null && subRoot==null){
            return true;
        }else if (node==null||subRoot==null||node.data!= subRoot.data){
            return false;
        }

        //left subtree non identical condition
        if(!isIdentical(node.left,subRoot.left)){
            return false;
        }
        //right subtree non identical condition
        if(!isIdentical(node.right,subRoot.right)){
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root,Node subRoot){
        //to find subRoot in tree
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }

        return isSubtree(root.left ,subRoot) || isSubtree(root.right,subRoot);
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

        /* subtree
             2
            / \
           4   5

         */

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubtree(root,subRoot));

    }
}
