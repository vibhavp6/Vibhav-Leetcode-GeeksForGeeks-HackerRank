/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        // If root is either p or q, we return root
        if (root == p || root == q) return root;

        // Recur for left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If left is null, answer lies in right
        if (left == null) return right;

        // If right is null, answer lies in left
        if (right == null) return left;

        // If both are not null, root is LCA
        return root;
    }
}
