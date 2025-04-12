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
    // int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        int [] arr = new int [1];
        if(root == null) return 0;
        height(root , arr);
       // return diameter;
       return arr[0];

    }
    public int height(TreeNode root, int [] arr) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int left = height(root.left , arr);
        int right = height(root.right ,arr);
        arr[0]  = Math.max(arr[0] , (left + right)); // diameter left+right hota hai
        return Math.max(left, right) + 1;
    }
}