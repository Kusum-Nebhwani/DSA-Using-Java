package BinarySearchTree;

import java.util.ArrayList;

public class MergeTwoBSTs {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;

        }
    }
    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInorder(root.left,inorder);
        inorder.add(root.data);
        getInorder(root.right,inorder);
    }
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


    public static ArrayList<Integer> mergeSortedArrays(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
        ArrayList<Integer> final_arr = new ArrayList<>();

        int left = 0;
        int right = 0;

        while(left < arr1.size()  &&  right< arr2.size()) {
            if (arr1.get(left) <= arr2.get(right)) {
                final_arr.add(arr1.get(left));
                left++;
            } else {
                final_arr.add(arr2.get(right));
                right++;
            }
        }

        while(left<arr1.size()){
            final_arr.add(arr1.get(left));
            left++;
        }

        while (right<arr2.size()){
            final_arr.add(arr2.get(right));
            right++;
        }


        return final_arr;

    }
    public static Node createBST(ArrayList<Integer>arr, int start, int end) {
        //base case
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
       Node root = new Node(arr.get(mid));
        root.left = createBST(arr,start,mid-1);
        root.right = createBST(arr,mid+1,end);


        return root;


    }

    public static Node mergedBSTs(Node root1,Node root2){
          //step1
        ArrayList<Integer> arr1 = new ArrayList<>();
         getInorder(root1,arr1);

         //step2
        ArrayList<Integer> arr2= new ArrayList<>();
        getInorder(root2,arr2);

        //step3
        ArrayList<Integer> merged_arr = new ArrayList<>();
        merged_arr = mergeSortedArrays(arr1,arr2);

        //step4
       return  createBST(merged_arr,0,merged_arr.size()-1);



    }

    public static void main(String[] args) {
        /*

         2                               9
        /  \                           /   \
       1    4                         3      8

       BST -> 1                        BST->2

         */


         Node root1 = new Node(2);
         root1.left = new Node(1);
         root1.right =new Node(4);


        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right =new Node(12);


        Node root = mergedBSTs(root1,root2);
        preorder(root);

    }
}
