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
    public TreeNode InOrder(TreeNode root, int val){
        if(root == null) return null;
        if(root.val == val) return root;


        TreeNode left = InOrder(root.left, val);
        TreeNode right = InOrder(root.right, val);

        if(left != null) return left; 

        return right;
 
    }
    public TreeNode searchBST(TreeNode root, int val) {
        return InOrder(root, val);
    }
}