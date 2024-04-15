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
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }
    
    private int dfs(TreeNode node, int pathSum) {
        if (node == null)
            return 0;
        
        pathSum = pathSum * 10 + node.val;
        
        if (node.left == null && node.right == null)
            return pathSum;
        
        return dfs(node.left, pathSum) + dfs(node.right, pathSum);
    }
}