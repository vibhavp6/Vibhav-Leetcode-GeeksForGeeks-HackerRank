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
    public int countNodes(TreeNode root) {
        if(root == null)return 0;
        int ans = count(root);
        return ans;
    }
    public int count(TreeNode root ){
        if(root == null)return 0;
        if(root.left == null && root.right == null) return 1;
        int lft = count(root.left);
        int rght = count(root.right);
        return lft+rght+1;
    }
}