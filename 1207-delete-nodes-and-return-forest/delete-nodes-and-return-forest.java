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
    private boolean[] set = new boolean[1001];
    private List<TreeNode> res;
    private TreeNode dfs(TreeNode root, boolean flag){
        if (root == null) return root;
        root.left = dfs(root.left, set[root.val]);
        root.right = dfs(root.right, set[root.val]);
        if (!set[root.val] && flag) res.add(root);
        return set[root.val] ? null : root;
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        res = new ArrayList<>();
        for (int n : to_delete)
            set[n] = true;
        dfs(root, true);
        return res;
    }
}