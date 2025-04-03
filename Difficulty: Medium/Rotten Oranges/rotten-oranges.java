//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int mat[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) mat[i][j] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(mat);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int orangesRotting(int[][] mat) {
        // Code here
        int n=mat.length,m=mat[0].length;
        int fresh=0,time=0;
        int[][] dir=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==2) q.add(new int[]{i,j});
                if(mat[i][j]==1) fresh++;
            }
        }
        if(fresh==0) return 0;
        while(!q.isEmpty()){
            int qn=q.size();
            while(qn-->0){
                int rotten[]=q.poll();
                for(int[] d:dir){
                    int ni=rotten[0]+d[0],nj=rotten[1]+d[1];
                    if(ni>=0 && nj>=0 && ni<n && nj<m && mat[ni][nj]==1){
                        mat[ni][nj]=2;
                        fresh--;
                        q.add(new int[]{ni,nj});
                    }
                }
            }
            time++;
            if(fresh==0) return time;
        }
        return -1;
    }
}