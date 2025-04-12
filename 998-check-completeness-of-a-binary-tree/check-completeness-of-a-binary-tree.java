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
    public boolean isCompleteTree(TreeNode root) {
    
     Queue <TreeNode> q = new LinkedList<>();
     q.add(root);
     boolean flag = false;
     while(!q.isEmpty()){
        TreeNode temp = q.poll();
        if(temp == null) flag = true;
        else if(flag == true) {
            return false; // ek level me agr ek null node agyi hai toh dubara koi non null node nahi ayegi (in a complete binary tree)
        }else{
            q.add(temp.left);
            q.add(temp.right);
        }
     }
     return true;
    }
}
