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
 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


import java.util.*;

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair<TreeNode, Long>> queue = new LinkedList<>();
        queue.offer(new Pair<>(root, 0L));

        long maxWidth = 0;

        while (!queue.isEmpty()) {
            int n = queue.size();
            long f = queue.peek().getValue();
            long l = ((LinkedList<Pair<TreeNode, Long>>) queue).peekLast().getValue();

            maxWidth = Math.max(maxWidth, l - f + 1);

            while (n-- > 0) {
                Pair<TreeNode, Long> current = queue.poll();
                TreeNode curr = current.getKey();
                long d = current.getValue();

                if (curr.left != null) queue.offer(new Pair<>(curr.left, 2 * d + 1));
                if (curr.right != null) queue.offer(new Pair<>(curr.right, 2 * d + 2));
            }
        }

        return (int) maxWidth;
    }
}