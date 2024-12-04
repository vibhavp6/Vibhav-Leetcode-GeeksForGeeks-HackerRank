//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {

        // taking input using BufferedReader class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // taking total count of testcases
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            // Reading the two Strings
            String s1 = br.readLine();
            String s2 = br.readLine();

            // Creating an object of class Rotate
            Solution obj = new Solution();

            // calling areRotations method
            // of class Rotate and printing
            //"1" if it returns true
            // else "0"
            if (obj.areRotations(s1, s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
// } Driver Code Ends



class Solution {
    // Function to check if two strings are rotations of each other or not
    public boolean areRotations(String s1, String s2) {
        // Check if lengths are different
        if (s1.length() != s2.length()) {
            return false;
        }

        // Combine s1 with itself to simulate all rotations
        String concatenated = s1 + s1;

        // Use KMP algorithm to check if s2 is a substring of concatenated
        return kmpSearch(concatenated, s2);
    }

    // KMP Algorithm for substring search
    private boolean kmpSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        // Build the prefix table for the pattern
        int[] lps = buildLPS(pattern);

        int i = 0, j = 0; // i -> text index, j -> pattern index
        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == m) { // Found the pattern
                    return true;
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1]; // Use the LPS table
                } else {
                    i++;
                }
            }
        }

        return false;
    }

    // Build the Longest Prefix Suffix (LPS) table for KMP
    private int[] buildLPS(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        int len = 0;
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        // Test cases
        System.out.println(obj.areRotations("abcd", "cdab")); // Output: true
        System.out.println(obj.areRotations("aab", "aba"));   // Output: true
        System.out.println(obj.areRotations("abcd", "acbd")); // Output: false
        System.out.println(obj.areRotations("", ""));         // Output: true
    }
}

