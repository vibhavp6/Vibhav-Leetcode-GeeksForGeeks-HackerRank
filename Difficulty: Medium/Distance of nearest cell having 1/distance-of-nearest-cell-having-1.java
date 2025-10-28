class Solution {
    public ArrayList<ArrayList<Integer>> nearest(int[][] grid) {
        // code here
        int n = grid.length; int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 0) grid[i][j] = -1;
                else{
                    grid[i][j] = 0;
                    q.add(new int[]{i,j});
                }
            }
        }
        
        while(!q.isEmpty()){
            int r = q.peek()[0];
            int c = q.remove()[1];
            
            if(r+1 < n && grid[r+1][c] == -1){
                grid[r+1][c] = grid[r][c] + 1;
                q.add(new int[]{r+1,c});
            }
            if(r-1 >= 0 && grid[r-1][c] == -1){
                grid[r-1][c] = grid[r][c] + 1;
                q.add(new int[]{r-1,c});
            }
            if(c+1 < m && grid[r][c+1] == -1){
                grid[r][c+1] = grid[r][c] + 1;
                q.add(new int[]{r,c+1});
            }
            if(c-1 >= 0 && grid[r][c-1] == -1){
                grid[r][c-1] = grid[r][c] + 1;
                q.add(new int[]{r,c-1});
            }
        }
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j < m; j++){
                list.add(grid[i][j]);
            }
            ans.add(list);
        }
        
        return ans;
    }
}