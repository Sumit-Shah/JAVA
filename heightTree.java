import java.util.*;
import java.util.LinkedList;

import javax.swing.plaf.nimbus.State;
public class heightTree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;

             
            this.left = null;
            this.right = null;
        }
    }






    //HEIGHT of treee
    public static int height(Node root) {
        if(root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }






    //COUNT of Nodes 
    public static int count(Node root) {
        if(root == null) {
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }





    //SUM of Nodes
    public static int sum(Node root) {
        if(root == null) {
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }




    // //DIAMETER of a Tree 
    // //Approach 1
    // public static int diameter(Node root) {   //O(n)^2
    //     if(root == null) {
    //         return 0;
    //     }

    //     int leftDiam = diameter(root.left);
    //     int leftHt = height(root.left);
    //     int rightDiam = diameter(root.right);
    //     int rightHt = height(root.right);

    //     int selfDiam = leftHt + rightHt + 1;

    //     return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    // }






    // //Approach2
    // static class Info {
    //     int diam;
    //     int ht;

    //     public Info(int diam, int ht) {
    //         this.diam = diam;
    //         this.ht = ht;
    //     }
    // }
    // public static Info diameter1(Node root) {   //O(n)

    //     if(root == null) {
    //         return new Info(0, 0);
    //     }
        
    //     Info leftInfo = diameter(root.left);
    //     Info rightInfo = diameter(root.right);

    //     int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
    //     int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

    //     return new Info(diam, ht);

    // }









    // //SUBTREE of Another Tree
    // public Static boolean isIdentical(Node node, Node subRoot) {
    //     if(node == null && subRoot == null) {
    //         return true;
    //     } else if(node == null || subRoot == null || node.data != subRoot.data) {
    //         return false;
    //     } 

    //     if(!isIdentical(node.left, subRoot.left)) {
    //         return false;
    //     }
    //     if(!isIdentical(node.right, subRoot.right)) {
    //         return false;
    //     }
    //     return true;

    // }

    // public static boolean isSubtree(Node root, Node subRoot) {
    //     if(root == null) {
    //         return false;
    //     }
    //     if(root.data == subRoot.data) {
    //         if(isIdentical(root, subRoot)) {
    //             return true;
    //         }
    //     }

    //     return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    // }





    //IMPORATANT 
    //TOP View of a Tree
     static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
     }

     public static void topView(Node root) {
        //Level Order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if(curr == null) {
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            }

            if(!map.containsKey(curr.hd)) { // first time my hd is occuring
                map.put(curr.hd, curr.node);
            }

            if(curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd-1));
                min = Math.min(min, curr.hd-1);
            }

            if(curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd-1));
                max = Math.max(max, curr.hd+1);           
             }
            
        }

        for(int i=min; i<=max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
     }

    public static void main(String[] args) {
        /* 
         *       1
         *      / \
         *    2    3 
         *   / \   / \
         *  4   5 6   7
         * */

         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node (6);
        //  root.right.right = new Node(7);

        //  System.out.println(height(root));


        // System.out.println(count(root));


        // System.out.println(sum(root));


        // System.out.println(diameter(root));


        // System.out.println(diameter1(root));





        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);



        // System.out.println(isSubtree(root, subRoot));



        topView(root);

    }
}
  