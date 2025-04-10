class Solution {

    // Custom Pair class for BFS traversal
    class Pair {
        TreeNode node;
        int vertical;
        int level;

        Pair(TreeNode node, int vertical, int level) {
            this.node = node;
            this.vertical = vertical;
            this.level = level;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0, 0));

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            TreeNode node = curr.node;
            int v = curr.vertical;
            int l = curr.level;

            map.computeIfAbsent(v, k -> new TreeMap<>())
               .computeIfAbsent(l, k -> new PriorityQueue<>())
               .add(node.val);

            if (node.left != null)
                q.offer(new Pair(node.left, v - 1, l + 1));
            if (node.right != null)
                q.offer(new Pair(node.right, v + 1, l + 1));
        }

        for (TreeMap<Integer, PriorityQueue<Integer>> levels : map.values()) {
            List<Integer> col = new ArrayList<>();
            for (PriorityQueue<Integer> pq : levels.values()) {
                while (!pq.isEmpty()) {
                    col.add(pq.poll());
                }
            }
            result.add(col);
        }

        return result;
    }
}
