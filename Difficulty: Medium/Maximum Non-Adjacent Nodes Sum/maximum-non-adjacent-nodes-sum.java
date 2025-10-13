/*
class Node {
    int data;
    Node left, right;

    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    private int getAns(Node root, HashMap<Node, Integer> dp) {
        if (root == null) return 0;
        if (dp.containsKey(root)) return dp.get(root);
        int include = root.data;
        if (root.left != null)
            include += getAns(root.left.left, dp) + getAns(root.left.right, dp);
        if (root.right != null)
            include += getAns(root.right.left, dp) + getAns(root.right.right, dp);
        int exclude = getAns(root.left, dp) + getAns(root.right, dp);
        int ans = Math.max(include, exclude);
        dp.put(root, ans);
        return ans;
    }

    public int getMaxSum(Node root) {
        return getAns(root, new HashMap<>());
    }
}