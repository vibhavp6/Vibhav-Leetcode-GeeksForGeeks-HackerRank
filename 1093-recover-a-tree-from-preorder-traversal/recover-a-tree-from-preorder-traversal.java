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
    public TreeNode recoverFromPreorder(String traversal) {
        TreeNode[] nodes = new TreeNode[1000];

        int i = 0, n = traversal.length();
        while (i < n && traversal.charAt(i) != '-') {
            i++;
        }
        int rootValue = Integer.parseInt(traversal.substring(0, i));
        TreeNode root = new TreeNode(rootValue);
        nodes[0] = root;

        int depth = 0;
        while (i < n) {
            while (i < n && traversal.charAt(i) == '-') {
                depth++;
                i++;
            }

            StringBuilder sb = new StringBuilder();
            while (i < n && traversal.charAt(i) != '-') {
                sb.append(traversal.charAt(i));
                i++;
            }
            int newNodeValue = Integer.parseInt(sb.toString());
            TreeNode newNode = new TreeNode(newNodeValue);

            int parentDepth = depth - 1;
            TreeNode parent = nodes[parentDepth];

            if (parent.left == null) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
            
            nodes[depth] = newNode;

            depth = 0;
            sb.setLength(0);
        }

        return root;
    }
}