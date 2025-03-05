//{ Driver Code Starts
// Initial Template for Java

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
            Solution ob = new Solution();
            int ans = ob.nthRoot(n, m);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int check(long mid,int n ,int m) {
        long p = 1;
        for(int i = 0 ; i <n; i++) {
            p *= mid;
            if(p > m) return 2;
        }
        if(p<m) return 1;
        return 0;
    }
    public int nthRoot(int n, int m) {
        // code here
        long left = 1 , right = m;
        while(left<=right) {
            long mid = left + (right-left)/2;
            long flag = check(mid,n,m);
                if(flag == 0) return (int) mid;
                else if( flag == 1) {
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            
        }
        return -1;
    }
}