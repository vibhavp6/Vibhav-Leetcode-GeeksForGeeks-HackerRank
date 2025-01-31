
class Solution {
    private int n;
    private int[][] grid;
    private Map<Integer, Integer> islandSizes = new HashMap<>();
    private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int largestIsland(int[][] grid) {
        this.n = grid.length;
        this.grid = grid;
        int color = 2; // Start coloring islands from 2
        int maxIsland = 0;
        boolean hasZero = false;

        // Step 1: Identify and color each island while storing their sizes
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int size = dfs(i, j, color);
                    islandSizes.put(color, size);
                    maxIsland = Math.max(maxIsland, size);
                    color++;
                } else {
                    hasZero = true;
                }
            }
        }

        // If the grid has no zero, return the size of the entire grid
        if (!hasZero) return maxIsland;

        // Step 2: Try converting each 0 into a 1 and compute the largest possible island
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> visitedIslands = new HashSet<>();
                    int newSize = 1; // Start with 1 (since we are flipping a zero)
                    
                    // Check all 4 directions for adjacent islands
                    for (int[] dir : DIRECTIONS) {
                        int x = i + dir[0], y = j + dir[1];
                        if (isValid(x, y) && grid[x][y] > 1 && visitedIslands.add(grid[x][y])) {
                            newSize += islandSizes.get(grid[x][y]);
                        }
                    }
                    
                    maxIsland = Math.max(maxIsland, newSize);
                }
            }
        }
        
        return maxIsland;
    }

    private int dfs(int i, int j, int color) {
        if (!isValid(i, j) || grid[i][j] != 1) return 0;
        
        grid[i][j] = color; // Mark cell with new color
        int size = 1;
        
        for (int[] dir : DIRECTIONS) {
            size += dfs(i + dir[0], j + dir[1], color);
        }
        
        return size;
    }

    private boolean isValid(int i, int j) {
        return i >= 0 && i < n && j >= 0 && j < n;
    }
}