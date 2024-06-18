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
            int ans = ob.rectanglesInCircle(N);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int rectanglesInCircle(int r) {
        // code here
        int count = 0,i,j; 
        for(i=1;i<=r*2;i++){
            for(j=1;j<=r*2;j++){
                if(((i*i)+(j*j))<=(r*r*4))
                    count++;
            }
        }
        return count;
    }
};