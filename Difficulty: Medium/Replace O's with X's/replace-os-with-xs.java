class Solution {
    public void fill(char[][] grid) {
        // Code here
        int n = grid.length; int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        
        for(int i = 0; i < n; i++){
            if(grid[i][0] == 'O') dfs(grid,vis,i,0,n,m);
            if(grid[i][m-1] == 'O') dfs(grid,vis,i,m-1,n,m);
        }
        
        for(int i = 0; i < m; i++){
            if(grid[0][i] == 'O') dfs(grid,vis,0,i,n,m);
            if(grid[n-1][i] == 'O') dfs(grid,vis,n-1,i,n,m);
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 'O' && !vis[i][j]){
                    grid[i][j] = 'X';
                }
            }
        }
    }
    private void dfs(char[][] grid, boolean[][] vis, int i, int j, int n, int m){
        vis[i][j] = true;
        
        if(i+1 < n && !vis[i+1][j] && grid[i+1][j] == 'O') dfs(grid,vis,i+1,j,n,m);
        if(i-1 >= 0 && !vis[i-1][j] && grid[i-1][j] == 'O') dfs(grid,vis,i-1,j,n,m);
        if(j+1 < m && !vis[i][j+1] && grid[i][j+1] == 'O') dfs(grid,vis,i,j+1,n,m);
        if(j-1 >= 0 && !vis[i][j-1] && grid[i][j-1] == 'O') dfs(grid,vis,i,j-1,n,m);
    }
    
}