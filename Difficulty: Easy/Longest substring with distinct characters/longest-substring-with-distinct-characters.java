//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        java.util.Set<Character> set = new java.util.HashSet<>();
        int maxLength = 0;
        int start = 0;
        for(int end=0;end<s.length();end++){
            char ch = s.charAt(end);
            while(set.contains(ch)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);
            maxLength = Math.max(maxLength, end-start+1);
        }return maxLength;
    }
}