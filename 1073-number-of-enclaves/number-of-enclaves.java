class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean [][] vis = new boolean [n][m];
        for(int i =0; i<n ;i ++) {
            for(int j = 0; j<m; j++){
                if(i == 0|| j==0 || i==n-1 || j == m-1){
                    if(grid[i][j]  == 1 && !vis[i][j]){
                        dfs(grid , i , j ,vis);
                    }
                }
            }
        }
            int count = 0;
            for(int i = 0; i<n; i++){
                for(int j = 0; j<m; j++){
                    if(grid[i][j] == 1){
                        count++;
                    }
                }
            }
            return count;
    }

    public  void dfs(int [][] grid , int i  , int j , boolean  [][] vis) {
        int n = grid.length;
        int m = grid[0].length;
        if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == 0 || vis[i][j] == true)  return;
        grid[i][j] = 0;
        vis[i][j] = true;
        dfs(grid, i - 1, j , vis);  
        dfs(grid, i + 1, j , vis);  
        dfs(grid, i, j - 1,vis);  
        dfs(grid, i, j + 1,vis); 
    }
}