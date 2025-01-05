class Solution {
    public boolean satisfiesConditions(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;

    // Check vertical condition
    for (int i = 0; i < m - 1; i++) {
        for (int j = 0; j < n; j++) {
            if (grid[i][j] != grid[i + 1][j]) {
                return false;
            }
        }
    }
    // Check horizontal condition
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n - 1; j++) {
            if (grid[i][j] == grid[i][j + 1]) {
                return false;
            }
        }
    }

    return true;
    }
}