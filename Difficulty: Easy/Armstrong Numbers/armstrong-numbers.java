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

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static Boolean armstrongNumber(int x) {
        // code here
         int sum =0;
        int d = x;
        while (x >0) {
            int ld = x%10;
            sum = sum + (ld*ld*ld);
            x =x/10;
        }
        if (sum == d) {
            return true;
        }
        return false;
    }
}