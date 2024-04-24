//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    public static int ways(int n, int m)
    {
        // complete the function
 int dp[][] = new int[n + 1][m + 1];
        int mod = (int) 1e9 + 7;
        
        for(int i = 0; i <= n; i++)
            dp[i][0] = 1;
            
        for(int i = 0; i <= m; i++)
            dp[0][i] = 1;
            
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                int a = (dp[i - 1][j] + dp[i][j - 1]) % mod;
                dp[i][j] = a % mod;
            }
        }
        
        return dp[n][m];
    }
}

//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    int x=Integer.parseInt(elements[0]);
		    int y=Integer.parseInt(elements[1]);
		    Solution ob = new Solution();
		    System.out.println(ob.ways(x,y));
		}
	}
}
// } Driver Code Ends