/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
} */
class Solution {
    private static int sum, level;
    public int sumOfLongRootToLeafPath(Node root) {
        sum = 0;
        level = -1;
        dfs(root, 0, 0);
        return sum;
    }
    
    private void dfs(Node node, int currSum, int currLevel) {
        if (node == null) return;
        
        currSum += node.data;
        if (currLevel == level) {
            sum = Math.max(currSum, sum);
        } else if (currLevel > level) {
            level = currLevel;
            sum = currSum;
        }
        
        dfs(node.left, currSum, currLevel + 1);
        dfs(node.right, currSum, currLevel + 1);
    }
}