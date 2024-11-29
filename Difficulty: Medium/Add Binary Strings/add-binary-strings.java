//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a, b;
            a = sc.next();
            b = sc.next();
            Solution ob = new Solution();
            System.out.println(ob.addBinary(a, b));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String addBinary(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        
        int carry = 0;
        
        while (i >= 0 || j >= 0 || carry == 1) {
            int a = (i >= 0) ? s1.charAt(i--) - '0' : 0;
            int b = (j >= 0) ? s2.charAt(j--) - '0' : 0;
            
            int sum = a + b + carry;
            
            result.append((sum % 2 == 0) ? '0' : '1');
            carry = sum / 2;
        }
        
        result.reverse();
        
        i = 0;
        while (result.charAt(i) == '0') {
            i++;
        }
        
        return result.toString().substring(i);
    }
}