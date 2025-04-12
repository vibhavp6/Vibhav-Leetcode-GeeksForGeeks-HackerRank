//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int m = Integer.parseInt(br.readLine().trim());
            int[][] image = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] S2 = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) image[i][j] = Integer.parseInt(S2[j]);
            }
            int sr = Integer.parseInt(br.readLine().trim());
            int sc = Integer.parseInt(br.readLine().trim());
            int newColor = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[][] ans = obj.floodFill(image, sr, sc, newColor);
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[i].length; j++)
                    System.out.print(ans[i][j] + " ");
                System.out.println();
            }

            System.out.println("~");
        }
    }
}

// } Driver Code Ends

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Code here
        int n=image.length,m=image[0].length;
        floodFill(sr,sc,image,image[sr][sc],newColor,new boolean[n][m],new int[][]{{0,1},{0,-1},{1,0},{-1,0}});
        return image;
    }
    private void floodFill(int i,int j,int mat[][],int cl,int nc,boolean vis[][],int dir[][]){
        if(i<0 || j<0 || i==mat.length || j==mat[0].length || mat[i][j]!=cl || vis[i][j]) return;
        mat[i][j]=nc;
        vis[i][j]=true;
        for(int[] d:dir) floodFill(i+d[0],j+d[1],mat,cl,nc,vis,dir);
    }
}