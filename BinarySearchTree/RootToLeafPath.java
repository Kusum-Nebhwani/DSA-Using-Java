package BinarySearchTree;

import java.util.ArrayList;

public class RootToLeafPath {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;

        }
    }
    public static void printPath(ArrayList<Integer> a){
        for(int i = 0;i<a.size();i++){
            System.out.print(a.get(i) + "->");
        }
        System.out.println("Null");
    }
    public static void printRootToLeafPath(Node root,ArrayList<Integer> path){


        if(root == null){
            return;
        }

        path.add(root.data);

        if(root.left==null && root.right ==null){
            //leaf node
            printPath(path);
        }


        printRootToLeafPath(root.left,path);
        printRootToLeafPath(root.right,path);
        path.remove(path.size()-1);

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


        printRootToLeafPath(root,new ArrayList<Integer>());
    }
}
