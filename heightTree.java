// import java.util.*;

// import javax.sound.midi.Soundbank;
// public class heightTree {
//     static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static int height(Node root) {
//         if(root == null) {
//             return 0;
//         }

//         int lh = height(root.left);
//         int rh = height(root.right);
//         return Math.max(lh, rh) + 1;
//     }


//     public static void main(String[] args) {
//         /* 
//          *       1
//          *      / \
//          *    2    3 
//          *   /      \
//          * 4    5  6    7
//          * */

//          Node root = new Node(1);
//          root.left = new Node(2);
//          root.right = new Node(3);
//          root.left.left = new Node(4);
//          root.left.right = new Node(5);
//          root.right.left = new Node (6);
//          root.right.right = new Node(7);

//          System.out.println(height(root));

//     }
// }












import java.util.*;

public class heightTree{
    static class TreeNode {
        int data;
        TreeNode left, right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        /* 
         *       1
         *      / \
         *    2    3 
         *   / \   / \
         *  4   5 6   7
         * */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("Height of the tree: " + getHeight(root));
    }
}
