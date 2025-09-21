class Solution {
    static int maxArea(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;

        // Heights array for histogram representation
        int[] height = new int[m];
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            // Update histogram heights
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    height[j] = 0;
                } else {
                    height[j] += 1;
                }
            }
            // Calculate max area for this row's histogram
            maxArea = Math.max(maxArea, largestRectangleArea(height));
        }

        return maxArea;
    }

    // Function to calculate largest rectangle area in histogram
    static int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int h = (i == n ? 0 : heights[i]);

            while (!st.isEmpty() && h < heights[st.peek()]) {
                int height = heights[st.pop()];
                int width = (st.isEmpty() ? i : i - st.peek() - 1);
                maxArea = Math.max(maxArea, height * width);
            }
            st.push(i);
        }
        return maxArea;
    }

    // For testing
    public static void main(String[] args) {
        int mat1[][] = {
            {0, 1, 1, 0},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 0, 0}
        };
        System.out.println(maxArea(mat1)); // Output: 8

        int mat2[][] = {
            {0, 1, 1},
            {1, 1, 1},
            {0, 1, 1}
        };
        System.out.println(maxArea(mat2)); // Output: 6
    }
}


