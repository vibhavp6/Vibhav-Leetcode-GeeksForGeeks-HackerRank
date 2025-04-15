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
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> ans = new ArrayList<>();
        inorder(root ,ans);
        return ans;
    }

    public void inorder(TreeNode root , List<Integer> ans) {
        if(root== null) return ;
        // if(root.left == null && root.right == null) {
        //     ans.add(root.val);
        //     return;
        // }
        inorder(root.left ,ans);
         ans.add(root.val);
        inorder(root.right, ans);
    }
}