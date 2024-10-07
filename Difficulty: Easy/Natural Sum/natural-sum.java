//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.find(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public int find(int n) {
        return natural(n, 1, 0);
    }
    
    public int natural(int n, int start, int currentsum) {
        if (currentsum == n) return start-1;
        
        currentsum += start;

        if (currentsum > n) return -1;

        return natural(n, start + 1, currentsum);
    }
}
