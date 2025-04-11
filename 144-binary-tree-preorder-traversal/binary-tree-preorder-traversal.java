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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorder(root ,ans);
        return ans;
    }

    public void preorder(TreeNode root , List<Integer> ans) {
        if(root== null) return ;
        if(root.left == null && root.right == null) {
            ans.add(root.val);
            return;
        }
        ans.add(root.val);
        preorder(root.left ,ans);
        preorder(root.right, ans);
    }
}