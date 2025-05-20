/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}  */
class Solution {

    static HashMap<Node, Integer> parentDist;
    static int res;

    /**
     * Mark the possible parents of the target nodes with there distance.
     * since only the parents are getting stored. the maximum space it can take
     * is O(n) when tree is skewed and average O(log n) when tree is balanced
     */
    static int parentMark(Node root, int target) {
        if (root == null) {
            return -1;
        }

        if (root.data == target) {
            parentDist.put(root, 0);
            return 0;
        }

        int left = parentMark(root.left, target);
        if (left != -1) {
            parentDist.put(root, left + 1);
            return left + 1;
        }

        int right = parentMark(root.right, target);
        if (right != -1) {
            parentDist.put(root, right + 1);
            return right + 1;
        }

        return -1;
    }

    /**
     * Simply this is finding shortest distance from 
     * the target node and taking maximum of it 
     * if the node is present as parent node then record its distance from map and 
     * move downward with incremented distance of current node.
     * if node is not parent then use current depth as the distance and move downwards
     */
    static void maxDist(Node root, int depth) {
        if (root == null) {
            return;
        }

        if (parentDist.containsKey(root)) {
            res = Math.max(res, parentDist.get(root));
            maxDist(root.left, parentDist.get(root) + 1);
            maxDist(root.right, parentDist.get(root) + 1);
        } else {
            res = Math.max(res, depth);
            maxDist(root.left, depth + 1);
            maxDist(root.right, depth + 1);
        }
    }

    public static int minTime(Node root, int target) {
        parentDist = new HashMap<>();
        parentMark(root, target);
        res = 0;
        maxDist(root, 0);
        return res;
    }
}