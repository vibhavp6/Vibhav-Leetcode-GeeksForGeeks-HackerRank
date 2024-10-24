class Solution {
    public int height(TreeNode root) {
        if (root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        int leftans = diameterOfBinaryTree(root.left);
        int rightans = diameterOfBinaryTree(root.right);
        int count =  height (root.left) + height(root.right) ;// agr khuyd node hua toh
        if (root.left != null) count ++;
        if (root.right !=  null) count++;
        int max =  Math.max(count , Math.max (rightans , leftans));
        return max;
    }
}