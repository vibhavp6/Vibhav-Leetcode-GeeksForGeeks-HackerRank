//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input_line[] = read.readLine().trim().split("\\s+");
            int n = Integer.parseInt(input_line[0]);
            String input_line1[] = read.readLine().trim().split("\\s+");
            int[][] a = new int[n][n];
            int c = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = Integer.parseInt(input_line1[c]);
                    c++;
                }
            }
            String ans = ob.pattern(a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public String pattern(int[][] arr) {
        // Code here
        if (arr.length <= 1) {
            return "0 R";
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(isRowPalindrome(arr[i])) {
                return ""+ i+ " R";
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(isColumnPalindrome(arr, i)) {
                return ""+ i+ " C";
            }
        }
        
        return "-1";
        
    }
    
    public Boolean isRowPalindrome(int [] arr) {
        for(int i = 0; i < arr.length / 2; i++) {
            if(arr[i] != arr[(arr.length - 1) - i]) {
                return false;
            }
        }
        
        return true;
    }
    
    public Boolean isColumnPalindrome(int[][] arr, int col) {
        for(int i = 0; i < arr.length / 2; i++) {
            if(arr[i][col] != arr[(arr.length  - 1) - i][col]) {
                return false;
            }
        }
        
        return true;
    }
}
