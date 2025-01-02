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
            String ans = ob.longestCommonPrefix(arr);

            if (ans.isEmpty()) {
                System.out.print("\"\"");
            } else {
                System.out.print(ans);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        if (arr.length == 0) return "";
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length-1];
        int idx = 0;
        while (idx < first.length() && idx <last.length()) {
            if (first.charAt(idx) == last.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return first.substring(0,idx);
    }
}