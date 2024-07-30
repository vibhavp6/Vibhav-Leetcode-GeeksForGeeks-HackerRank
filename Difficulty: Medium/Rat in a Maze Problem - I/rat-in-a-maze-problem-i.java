//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends

class Solution {
    void f(int i, int j, boolean vis[][], String psf, int arr[][],ArrayList<String > ans){
        if( i<0 || j<0 || i>=arr.length || j>=arr[0].length || vis[i][j]==true || arr[i][j]!=1){
            return ;
        }
        
        if(i==arr.length-1 && j==arr.length-1){
            ans.add(psf);
            return;
        }
        
        vis[i][j]=true;
        f(i,j+1,vis, psf+"R",arr,ans);
        f(i+1,j,vis, psf+"D",arr,ans);
        f(i,j-1,vis, psf+"L",arr,ans);
        f(i-1,j,vis, psf+"U",arr,ans);
        vis[i][j]=false;
    }
    
    public ArrayList<String> findPath(int[][] mat) {
        ArrayList<String > ans=new ArrayList<>();
        int n=mat.length;
        boolean vis[][]=new boolean[n][n];
        f(0,0,vis,"",mat,ans);
        return ans;
    }
}