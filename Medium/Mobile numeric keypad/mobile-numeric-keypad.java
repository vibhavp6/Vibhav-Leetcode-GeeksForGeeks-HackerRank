//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.getCount(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public long getCount(int n) {
        // Your code goes here
         if(n == 1) return (long)10;
        long dp[][] = new long[n + 1][10];
        Arrays.fill(dp[1], 1);
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(0, 8)));
        adj.add(new ArrayList<>(Arrays.asList(1,2,4)));
        adj.add(new ArrayList<>(Arrays.asList(2,1,3,5)));
        adj.add(new ArrayList<>(Arrays.asList(3,2,6)));
        adj.add(new ArrayList<>(Arrays.asList(4,1,5,7)));
        adj.add(new ArrayList<>(Arrays.asList(5,2,4,6,8)));
        adj.add(new ArrayList<>(Arrays.asList(6,3,5,9)));
        adj.add(new ArrayList<>(Arrays.asList(7,4,8)));
        adj.add(new ArrayList<>(Arrays.asList(8,5,7,9,0)));
        adj.add(new ArrayList<>(Arrays.asList(9,6,8)));
        
        long count = 0;
        for(int i = 0; i <= 9; i++){
            count += recursive(dp, i, n, adj);
        }
        return count;
    }
    public long recursive(long dp[][], int i, int length, ArrayList<ArrayList<Integer>> adj){
        if(dp[length][i] != 0) return dp[length][i];
        else{
            long sum = 0;
            for(int iter = 0; iter < adj.get(i).size(); iter++){
                sum += recursive(dp, adj.get(i).get(iter), length - 1, adj);
            }
            return dp[length][i] = sum;
        }
    }
}