package BinaryTree;
import java.util.*;
public class TopViewOfTree {
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
    static class Info{
        Node node;
        int hd; // horizontal distance

        public  Info(Node node,int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root){
        //level order traversal
        Queue<Info> q = new LinkedList<>();

        //hashmap creation
        HashMap<Integer,Node> map = new HashMap<>();

        int min =0,max =0;

        //initially add root with hd '0' and null in queue
        q.add(new Info(root,0));
        q.add(null); //null->signifies end of a level

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else {
                if (!map.containsKey(curr.hd)) {  //first time my hd is occurring
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) { //for left child of a node
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                if (curr.node.right != null) { //for right child of a node
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
        //printing the values of node
        System.out.print("top view of  tree: ");
        for(int i = min;i<=max;i++){
            System.out.print(map.get(i).data + " ");
        }


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

        topView(root);


    }
}
