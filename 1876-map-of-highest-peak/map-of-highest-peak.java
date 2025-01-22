class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length; // Number of rows in the grid
        int n = isWater[0].length; // Number of columns in the grid
        int height = 0; // Height to be assigned to each cell level by level

        // Directions for moving up, down, left, and right
        int[][] dir = { {1, 0}, {-1, 0}, {0, 1}, {0, -1} };
        int[][] ans = new int[m][n]; // Result grid to store the height of each cell
        boolean[][] visited = new boolean[m][n]; // To keep track of visited cells

        // Queue for BFS (breadth-first search)
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) {
                    // If the cell is water, set it as the starting point with height 0
                    q.offer(new int[] { i, j });
                    visited[i][j] = true; // Mark water cells as visited
                }
            }
        }

        // BFS to calculate heights for all cells
        while (!q.isEmpty()) {
            int len = q.size(); // Number of cells to process at the current height
            while (len-- > 0) {
                int[] curr = q.poll(); // Get the current cell
                int i = curr[0];
                int j = curr[1];
                ans[i][j] = height; // Assign the current height to the cell

                // Check all four neighboring cells
                for (int[] d : dir) {
                    int ni = i + d[0]; // Neighbor row index
                    int nj = j + d[1]; // Neighbor column index
                    // If the neighbor is within bounds and not visited
                    if (ni >= 0 && ni < m && nj >= 0 && nj < n && !visited[ni][nj]) {
                        q.offer(new int[] { ni, nj }); // Add neighbor to the queue
                        visited[ni][nj] = true; // Mark the neighbor as visited
                    }
                }
            }
            height++; // Increment the height for the next level of cells
        }
        return ans; // Return the result grid
    }
}