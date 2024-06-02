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










    //  //BINARY TREES(Part 3)
    //  //Kth Level
    //  public static void KLevel(Node root, int level, int k) {
    //     if (root == null) {
    //         return;
    //     }
    
    //     if (level == k) {
    //         System.out.print(root.data + " ");
    //         return;
    //     }
        
    //     // Decrement the level when traversing down the tree
    //     KLevel(root.left, level + 1, k);
    //     KLevel(root.right, level + 1, k);
    // }









    //LOWEST COMMON ANCESTOR
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if(root == null) {
            return false;
        }

        path.add(root);

        if(root.data == n) {
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if(foundLeft || foundRight) {
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }


    public static Node lca(Node root, int n1, int n2) {  //(n)
        ArrayList<Node> path1 =new ArrayList<>();
        ArrayList<Node> path2 =new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        //last common ancestor
        int i = 0;
        for(; i<path1.size() && i<path2.size(); i++) {
            if(path1.get(i) != path2.get(i)) {
                break;
            }
        }


        //last equal node -> i-1th
        Node lca = path1.get(i-1);
        return lca;
    }










    //Lowest COmmon acestor 
    public static Node lca2(Node root, int n1, int n2) {
        if(root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);


        //leftLCA=val rightLca = null 
        if(rightLca == null) {
            return leftLca;
        }
        if(leftLca == null) {
            return rightLca;
        }

        return root;
    }





    // MIN DISTANCE BWTWEEN NODES 
    public static int lcaDist(Node root, int n) {
        if(root == null) {
            return -1;
        }

        if(root.data == n) {
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1) {
            return -1;
        } else if(leftDist == -1) {
            return rightDist+1;
        }else {
            return leftDist+1;
        }
    }

    public static int minDist(Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(lca, n2);
        int dist2 = lcaDist(lca, n2);

        return dist1 + dist2;
    }










    //TRANSFORM TO SUM TREE
    public static int transform(Node root) {
        if(root == null) {
            return 0;
        }

        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftChild + newRight + rightChild;
        return data;

    }
    public static void preorder(Node root) {
        if(root == null) {
            return;
        }
    }
    
    public static void main(String[] args) {
        /* 
         *       1
         *      / \
         *    2    3 
         *   / \   / \
         *  4   5 6   7'
         * 
         * 
         * 
         * expected summ tree is : 

         * 0 0 
         27
       /    \
      9      13
     / \    /  \
    0   0  0    0

         * */

         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node (6);
         root.right.right = new Node(7);

        //  System.out.println(height(root));


        // System.out.println(count(root));


        // System.out.println(sum(root));


        // System.out.println(diameter(root));


        // System.out.println(diameter1(root));





        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);



        // System.out.println(isSubtree(root, subRoot));



        // topView(root);



        // int k = 3;
        // KLevel(root, 1, k);





        // int n1 = 4, n2 =5;
        // System.out.println(lca(root, n1, n2).data);





        // int n1 = 4, n2 = 6;
        // System.out.println(lca2(root, n1, n2).data);



        // int n1 = 4, n2 = 5;
        // System.out.println(minDist(root, n1, n2));






        transform(root);
        preorder(root);


    }
}
   