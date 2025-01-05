//{ Driver Code Starts
// Initial template for JAVA

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function template for JAVA

class Solution {
    // Function to check if a string is Pangram or not.
    public static boolean checkPangram(String s) {
        // your code here
        int []  vib = new int [26];
        s = s.toLowerCase();
        for (int i = 0; i<s.length(); i++) {
            char v =  s.charAt(i);
            if(v>= 'a' && v<= 'z') {
            vib[v-'a']++;
            }
        }
        for (int c : vib) {
            if(c == 0) return false;
        }
        return true;
    }
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine().trim();

            System.out.println(new Solution().checkPangram(s) == true ? "true"
                                                                      : "false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends