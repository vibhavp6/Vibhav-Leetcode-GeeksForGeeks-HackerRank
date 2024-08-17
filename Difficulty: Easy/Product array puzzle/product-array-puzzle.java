//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array);

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            t--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static long[] productExceptSelf(int nums[]) {
        // code here
        int n = nums.length;
        long left=1;
        
        long right[] = new long[n];
        
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            right[i] = right[i+1]*nums[i+1];
        }
        
        long ans[] = new long[n];
        for(int i=0;i<n;i++){
            ans[i] = left*right[i];
            left = left*nums[i];
        }
        
        return ans;
    }
}
