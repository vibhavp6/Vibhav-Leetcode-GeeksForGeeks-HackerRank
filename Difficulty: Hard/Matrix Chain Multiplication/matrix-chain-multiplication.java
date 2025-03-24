//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().matrixMultiplication(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
     public static int mcm(int[] arr, int i, int j, int[][] dp){
         // base case 
         if(i >= j) return 0;
         
         if(dp[i][j] != -1){
             return dp[i][j];
         }
         int mn = Integer.MAX_VALUE;
         for(int k=i; k<=j-1; k++){ // ((A)(BCD) -> ((AB(CD))) -> ((ABC)(D))
             int temp = mcm(arr, i, k, dp) + mcm(arr, k+1, j, dp) + arr[i-1] * arr[k] * arr[j];
            mn = Math.min(mn, temp);
         }
        
         return dp[i][j] = mn;
     }
    static int matrixMultiplication(int arr[]) {
        int n = arr.length;
         int[][] dp = new int[n+1][n+1];
         for(int i=0; i<n; i++){
             for(int j=0; j<n; j++){
                 dp[i][j] = -1;
             }
         }
         
         
      return  mcm(arr, 1, n-1, dp);
    }
}

