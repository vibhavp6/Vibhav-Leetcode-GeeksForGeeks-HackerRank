//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.firstElement(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int firstElement(int n) {
        // code here
          int[][] a = {{1, 1},
     {1, 0}};
int[][] b = {{1, 1},
     {1, 0}};
 
for (int i = 0;i < n-1 ;i++ ) {
int x = (b[0][0] * a[0][0] + b[0][1]*a[1][0]) % 1000000007;
int y = (b[0][0] * a[0][1] + b[0][1]*a[1][1]) % 1000000007;
int z = (b[1][0] * a[0][0] + b[1][1]*a[1][0]) % 1000000007;
int w = (b[1][0] * a[0][1] + b[1][1]*a[1][1]) % 1000000007;
 
b[0][0] = x;
            b[0][1] = y;
            b[1][0] = z;
            b[1][1] = w;
}
return b[1][0];
    }
}