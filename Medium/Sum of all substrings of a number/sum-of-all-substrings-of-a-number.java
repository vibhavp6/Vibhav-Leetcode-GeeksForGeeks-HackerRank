//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    //taking the String
		    String s=sc.nextLine();
		    Solution ob = new Solution();
		    //calling method sumSubstrings() 
		    System.out.println(ob.sumSubstrings(s));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static long sumSubstrings(String s)
    {
        int n = s.length(), mod = (int)1e9 + 7;
        long dp[] = new long[n];
        
        dp[0] = s.charAt(0) - '0';
        long res = dp[0];
    
        for(int i = 1; i < n; i++) 
        {
            dp[i] = ((dp[i - 1] * 10) % mod + ((s.charAt(i) - '0') * (i + 1)) % mod) % mod;
            res = (res + dp[i]) % mod;
        }
        
        return res % mod;
    }
}