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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean ans = helper(p,q);
        return ans;
    }
    public boolean helper(TreeNode p , TreeNode q){
        if(p == null && q == null) return true;
        if(p == null|| q == null) return false;
        return (p.val == q.val) &&helper(p.left  , q.left) && helper(p.right, q.right);    
    }
}