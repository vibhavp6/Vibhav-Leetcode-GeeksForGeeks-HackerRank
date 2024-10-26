/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        // Check if the node is a leaf node
        if (root.left == null && root.right == null) {
            if( targetSum == root.val ) return true;
        }

        // Recursive calls for left and right subtrees
        boolean leftans = hasPathSum(root.left, targetSum - root.val);
        boolean rightans = hasPathSum(root.right, targetSum - root.val);

        // Return true if either leftans or rightans is true
        if (leftans) {
            return true;
        } else if (rightans) {
            return true;
        } else {
            return false;
        }
    }
}
