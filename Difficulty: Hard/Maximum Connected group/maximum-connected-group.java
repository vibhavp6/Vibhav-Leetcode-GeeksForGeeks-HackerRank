//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[][] grid = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution obj = new Solution();
            int ans = obj.MaxConnection(grid);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public int MaxConnection(int grid[][]) {
        int n=grid.length;
        //part 1
        Map<Integer,Integer> compToCount = new HashMap<>();
        
        int id = 2;
        for(int i=0; i<n; i++)
        for(int j=0; j<n; j++){
            if(grid[i][j] != 1) continue;
            
            int count = dfs(grid, i, j, id);//give same id to all the cells of same component
            compToCount.put(id, count);//store count of cells corresponding to that id
            id++;
        }
        
        //part 2
        int maxCnt = grid[0][0]==0 ? 1 : compToCount.get(grid[0][0]);//edge case when all cells are 1
        
        Set<Integer> set = new HashSet<>(4);//adjacent cells may belong to same id(i.e same component)
        
        for(int i=0; i<n; i++)
        for(int j=0; j<n; j++){
            if(grid[i][j] != 0) continue;
            int cnt = 1;
            
            for(int[] dir : directions){
                int r = dir[0]+i, c = dir[1]+j;
                if(checkBounds(r, c, n) && grid[r][c]!=0 && set.add(grid[r][c]))
                    cnt+= compToCount.get(grid[r][c]);
            }
            
            if(cnt > maxCnt) maxCnt = cnt;
            set.clear();
        }    
        
        return maxCnt;
    }
    
    private static int dfs(int[][] grid, int i, int j, int id){
        grid[i][j] = id;
        
        int cnt = 1;
        for(int[] dir : directions){
            int r = dir[0]+i, c = dir[1]+j;
            
            if(checkBounds(r, c, grid.length) && grid[r][c]==1){
                cnt+= dfs(grid, r, c, id);
            }
        }
        
        return cnt;
    }
    
    private static int[][] directions = {{-1,0}, {1,0}, {0,1}, {0,-1}};
    
    private static boolean checkBounds(int i, int j, int n){
        return i>=0 && i<n && j>=0 && j<n;
    }
}
 