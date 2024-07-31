//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String longestCommonPrefix(String arr[]) {
        if (arr == null || arr.length == 0) {
            return "-1";
        }

        // Take the first string as a reference
        String prefix = arr[0];
        
        // Iterate over the rest of the strings
        for (int i = 1; i < arr.length; i++) {
            // Adjust the prefix to the current string
            while (arr[i].indexOf(prefix) != 0) {
                // Shorten the prefix by one character from the end
                prefix = prefix.substring(0, prefix.length() - 1);
                // If the prefix becomes empty, there is no common prefix
                if (prefix.isEmpty()) {
                    return "-1";
                }
            }
        }
        
        return prefix;
    }
}