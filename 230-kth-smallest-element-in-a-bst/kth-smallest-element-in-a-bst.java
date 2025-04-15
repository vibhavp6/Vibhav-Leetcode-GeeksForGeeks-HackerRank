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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        inorder(root, k, maxHeap);
        return maxHeap.peek();
    }

    private void inorder(TreeNode root, int k, PriorityQueue<Integer> maxHeap) {
        if (root == null) return;

        inorder(root.left, k, maxHeap);

        maxHeap.offer(root.val);
        if (maxHeap.size() > k) {
            maxHeap.poll();
        }

        inorder(root.right, k, maxHeap);
    }
}