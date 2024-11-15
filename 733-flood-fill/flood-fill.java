import java.util.*;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int originalColor = image[sr][sc];

        // If the new color is the same as the original, no need to proceed
        if (originalColor == color) {
            return image;
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr, sc});
        image[sr][sc] = color;

        // Directions for moving up, down, left, and right
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int x = pos[0];
            int y = pos[1];

            for (int[] dir : directions) {
                int xx = x + dir[0];
                int yy = y + dir[1];

                if (xx >= 0 && xx < n && yy >= 0 && yy < m && image[xx][yy] == originalColor) {
                    queue.offer(new int[]{xx, yy});
                    image[xx][yy] = color;
                }
            }
        }

        return image;
    }
}
