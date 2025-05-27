class Solution {
    public ArrayList<Integer> leafNodes(int[] preorder) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int n = preorder.length;

        for (int i = 0; i < n - 1; i++) {
            int curr = preorder[i];
            int next = preorder[i + 1];
            boolean isLeaf = false;

            if (next < curr) {
                // Going left subtree
                stack.push(curr);
            } else {
                // Going right subtree
                while (!stack.isEmpty() && next > stack.peek()) {
                    stack.pop();
                    isLeaf = true;
                }
                if (isLeaf) {
                    // Current is a leaf
                    result.add(curr);
                }
            }
        }

        // Last node is always a leaf
        result.add(preorder[n - 1]);

        return result;
    }
}