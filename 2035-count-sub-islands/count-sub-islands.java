class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int row = grid1.length;
        int column = grid1[0].length;
        int count = 0;
        boolean [][] visit = new boolean[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid1[i][j] == 1 && grid2[i][j] == 1 && !visit[i][j]) {
                    boolean isSubIsland = dfs(i, j, grid1, grid2, visit);
                    if (isSubIsland) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public boolean dfs(int i, int j, int[][] grid1, int[][] grid2, boolean[][] visit) {
        int n = grid1.length;
        int m = grid1[0].length;

 
        if (i < 0 || i >= n || j < 0 || j >= m || grid2[i][j] == 0 || visit[i][j]) {
            return true; 
        }

        visit[i][j] = true;

        // Check if the current island in grid2 is part of an island in grid1
        boolean isSubIsland = grid1[i][j] == 1;

        // Explore all 4 directions (up, down, left, right)
        if (i - 1 >= 0) isSubIsland &= dfs(i - 1, j, grid1, grid2, visit);
        if (i + 1 < n) isSubIsland &= dfs(i + 1, j, grid1, grid2, visit);
        if (j - 1 >= 0) isSubIsland &= dfs(i, j - 1, grid1, grid2, visit);
        if (j + 1 < m) isSubIsland &= dfs(i, j + 1, grid1, grid2, visit);

        // Return if it's a valid sub-island
        return isSubIsland;
    }
}
