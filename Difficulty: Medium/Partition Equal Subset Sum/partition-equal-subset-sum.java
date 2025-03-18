//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Solution ob = new Solution();

            if (ob.equalPartition(arr))
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public static boolean dp[][];
    static boolean solve(int ind , int target , int arr[]){
         if(target ==0) return true;
        if(ind ==0) {
            if(target == arr[0]) return true;
            else return false ;
        }
        if(dp[ind][target]) return  dp[ind][target];
        boolean notTake = solve(ind -1 , target , arr);
        boolean take = false;
        if(arr[ind] <= target ) take = solve(ind -1 , target - arr[ind] , arr);
        
        return dp[ind][target] =  take || notTake;
        
    }
    static boolean equalPartition(int arr[]) {
        // code here
        int n  = arr.length ;
        int sum = 0;
        for(int num : arr){
            sum+= num;
        }
        if(sum %2 !=0 ) return false ;
        
        int target = sum /2;
        boolean dp[][] = new boolean [n][target +1];
        
        for(int i =0 ; i < n ; i++){
            dp[i][0] = true;
        }
         if(arr[0] <= target)  dp[0][arr[0]] = true;
        for(int ind = 1; ind < n ; ind++){
            for(int tar = 1 ; tar <= target ; tar++){
                 boolean notTake = dp[ind -1][tar];
                 boolean take = false;
                 if(arr[ind] <= tar ) take = dp[ind -1][tar - arr[ind]];
        
                 dp[ind][tar] =  take || notTake;
            }
        }
        return dp[n-1][target];
    }
}