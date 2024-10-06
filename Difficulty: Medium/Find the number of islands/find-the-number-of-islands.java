//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


 //
//here
class Solution {
    void dfs(int i,int j, char arr[][], int dir[][]){
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]-'0'==0)return ;
 
        arr[i][j]='0';
        for(int k=0;k<dir.length;k++){
            int x=i+dir[k][0];
            int y=j+dir[k][1];
            dfs(x,y,arr,dir);
        }
    }
    
  
    public int numIslands(char[][] arr) {
        int cnt=0;
        int n=arr.length;
        int m=arr[0].length;
        int dir[][]={{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}};
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]-'0'==1){
                    dfs(i,j,arr, dir);
                    cnt++;
                }
            }
        }
        return cnt;        
    }
}