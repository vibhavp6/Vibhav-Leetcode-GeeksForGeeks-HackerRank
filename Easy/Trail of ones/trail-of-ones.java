//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.numberOfConsecutiveOnes(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int numberOfConsecutiveOnes(int n) {
        int MOD=(int)Math.pow(10,9)+7;
        long ans=1;
        int x=0,y=1;
        for(int i=3;i<=n;i++){
            ans=(ans*2+x+y)%MOD;
            x=x%MOD;
            y=y%MOD;
            int temp=x;
            x=y;
            y=y+temp;
        }
        return (int)ans;
    }
}