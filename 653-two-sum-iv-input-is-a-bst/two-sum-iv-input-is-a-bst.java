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
// class Solution {
//     public void inorder(TreeNode root , ArrayList<Integer> ans ){
//         if(root == null) return ;
//         inorder(root.left , ans);
//         ans.add(root.val);
//         inorder(root.right, ans);
//     }
//     public boolean findTarget(TreeNode root, int k) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         inorder(root, ans);
//         HashSet<Integer> st = new HashSet<>();
//         for(int num : ans) {
//             int diff = k - num;
//             if(st.contains(diff)){
//                 return true;
//             }
//             st.add(num);
//         }
//         return false;
//     }
// }

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> seen = new HashSet<>();
        return dfs(root, k, seen);
    }

    private boolean dfs(TreeNode node, int k, HashSet<Integer> seen) {
        if (node == null) return false;

        if (seen.contains(k - node.val)) return true;

        seen.add(node.val);

        return dfs(node.left, k, seen) || dfs(node.right, k, seen);
    }
}