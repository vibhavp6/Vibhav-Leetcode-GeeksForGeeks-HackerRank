//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.lps(s));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int lps(String str) {
        // code here
        int n=str.length();
        int p=0,s=1,cnt=0,pos=0;
        while(p<n&&s<n){
            if(str.charAt(p)==str.charAt(s)){
                p++;
                s++;
                cnt++;
            }
            else{
                pos++;
                s=pos;
                cnt=0;
                p=0;
            }
        }
        return cnt;
    }
}