//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    
    public int helper (int k ,int [] nums, int index , int []dp) {
        if (index>= nums.length-1) return 0;
        if (dp[index] != -1) return dp [index];
        int mincost = Integer.MAX_VALUE;
        for (int j = 1; j <= k && index + j <nums.length; j++) {
            int kstep = Math.abs(nums[index] - nums[index+j]) + helper(k , nums, index+j , dp);
            mincost = Math.min(mincost, kstep);
        }
        

        return dp[index] = mincost;
    }
    
    
    public int minimizeCost(int k, int arr[]) {
        // code here
        int n = arr.length;
        int [] dp = new int [n];
          for(int i = 0; i < n; i++) dp[i] = -1;
        return helper( k ,arr, 0 , dp);
    }
}



//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.minimizeCost(k, arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends