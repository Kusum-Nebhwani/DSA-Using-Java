/*package BinarySearchTree;

public class AvlTrees {
    static class Node{
        int data;
        int height;
        Node right,left;

        Node(int data){
            this.data = data;
            height = 1;
        }
    }
    public static Node root;
    public static int height(Node root){
        if(root == null){
            return 0;
        }
       return root.height;
    }
    public Node leftRotate(Node x) {
        //left rotate subtree rooted with x

        Node y = x.right;
        Node t2 = y.left;



    }
    public class Node insert(Node root,int key){
        if(root == null){
            return new Node(key);
        }

        if(key<root.data){
            root.left = insert(root.left,key);

        } else if (key>root.data) {
            root.right = insert(root.right,key);

        }else{
            return root; //in case of duplicate keys simply return root
        }


        //update root height
        root.height = 1 + Math.max(height(root.left),height(root.right));

        //get balance factor
        int bf = getBalance(root);

        //left-left case
        if(bf>1 && key<root.left.data){
            return rightRotate(root);
        }

        //right-right case
        if(bf<- 1 && key>root.right.data){
            return leftRotate(root);
        }

        //left-right case
        if(bf>1 && key>root.left.data){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        //right-left case
        if(bf<-1 && key < root.right.data){
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    public Node rightRotate(Node root) {

    }



    public static void main(String[] args) {
         root = insert(root,10);
         root = insert(root,20);
         root = insert(root,30);
         root = insert(root,40);
         root = insert(root,50);
         root = insert(root,25);


    }
}
*/