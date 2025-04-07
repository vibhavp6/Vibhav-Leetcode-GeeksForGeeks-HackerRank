class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        
        // If the starting pixel already has the target color, no changes are needed.
        if (originalColor == color) {
            return image;
        }
        
        // Perform DFS to fill the connected region
        dfs(image, sr, sc, originalColor, color);
        return image;
    }

    private void dfs(int[][] image, int i, int j, int originalColor, int color) {
        int rows = image.length;
        int cols = image[0].length;

        // Boundary and base condition checks
        if (i < 0 || i >= rows || j < 0 || j >= cols || image[i][j] != originalColor) {
            return;
        }

        // Change the color of the current pixel
        image[i][j] = color;

        // Perform DFS in all four directions
        dfs(image, i - 1, j, originalColor, color); // Up
        dfs(image, i + 1, j, originalColor, color); // Down
        dfs(image, i, j - 1, originalColor, color); // Left
        dfs(image, i, j + 1, originalColor, color); // Right
    }
}
