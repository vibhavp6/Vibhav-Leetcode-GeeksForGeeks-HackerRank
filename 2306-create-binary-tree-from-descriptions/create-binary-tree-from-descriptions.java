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
    public TreeNode createBinaryTree(int[][] descriptions) {
        TreeNode[] map = new TreeNode[100001];
        boolean[] child = new boolean[100001];
        for (int[] d : descriptions){
            if (map[d[0]] == null) map[d[0]] = new TreeNode(d[0]);
            TreeNode node = (map[d[1]] == null ? new TreeNode(d[1]) : map[d[1]]);
            if (d[2] == 1) map[d[0]].left = node;
            else map[d[0]].right = node;
            map[node.val] = node;
            child[d[1]] = true;
        }
        for (int[] d : descriptions)
            if (!child[d[0]])
                return map[d[0]];
        return null;
    }
}