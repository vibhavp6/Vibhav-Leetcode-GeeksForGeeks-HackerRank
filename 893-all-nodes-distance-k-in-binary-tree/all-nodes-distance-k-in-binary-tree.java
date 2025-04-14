import java.util.*;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    Map<TreeNode, TreeNode> parent = new HashMap<>();

    private void addParent(TreeNode root) {
        if (root == null) return;

        if (root.left != null) {
            parent.put(root.left, root);
            addParent(root.left);
        }

        if (root.right != null) {
            parent.put(root.right, root);
            addParent(root.right);
        }
    }

    private void collectKDistanceNodes(TreeNode target, int k, List<Integer> result) {
        Queue<TreeNode> queue = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();

        queue.offer(target);
        visited.add(target);

        while (!queue.isEmpty()) {
            int size = queue.size();

            if (k == 0) break;

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();

                if (curr.left != null && !visited.contains(curr.left)) {
                    queue.offer(curr.left);
                    visited.add(curr.left);
                }

                if (curr.right != null && !visited.contains(curr.right)) {
                    queue.offer(curr.right);
                    visited.add(curr.right);
                }

                if (parent.containsKey(curr) && !visited.contains(parent.get(curr))) {
                    queue.offer(parent.get(curr));
                    visited.add(parent.get(curr));
                }
            }

            k--;
        }

        while (!queue.isEmpty()) {
            result.add(queue.poll().val);
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result = new ArrayList<>();
        addParent(root);
        collectKDistanceNodes(target, k, result);
        return result;
    }
}