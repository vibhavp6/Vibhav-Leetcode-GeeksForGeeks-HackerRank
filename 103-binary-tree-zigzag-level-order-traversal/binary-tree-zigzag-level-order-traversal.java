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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack1 = new Stack<>(); // For left-to-right traversal
        Stack<TreeNode> stack2 = new Stack<>(); // For right-to-left traversal
        stack1.push(root);

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            List<Integer> level = new ArrayList<>();

            // Process nodes in stack1 (left-to-right) and push children to stack2
            while (!stack1.isEmpty()) {
                TreeNode node = stack1.pop();
                level.add(node.val);
                // For left-to-right order, push left child first, then right child
                if (node.left != null) stack2.push(node.left);
                if (node.right != null) stack2.push(node.right);
            }
            if (!level.isEmpty()) result.add(level); // Add current level to result

            level = new ArrayList<>();

            // Process nodes in stack2 (right-to-left) and push children to stack1
            while (!stack2.isEmpty()) {
                TreeNode node = stack2.pop();
                level.add(node.val);
                // For right-to-left order, push right child first, then left child
                if (node.right != null) stack1.push(node.right);
                if (node.left != null) stack1.push(node.left);
            }
            if (!level.isEmpty()) result.add(level);
        }

        return result;  // Return the zigzag level order traversal as a list of lists.
    }
}