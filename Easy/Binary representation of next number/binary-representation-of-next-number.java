//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Solution ob = new Solution();
            System.out.println(ob.binaryNextNumber(s));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String binaryNextNumber(String s) {
        // code here.
                //counting leading zeros
        int n = 0;
        while (n < s.length() && s.charAt(n) == '0')
            n += 1;
        
        //If the entire string consists of zeros
        if (n == s.length())
            return "1";
        
        ///removing leading zeros from the string
        s = s.substring(n, s.length());
        
        //Converting to char array for Manipulations
        char res[] = s.toCharArray();
        n = res.length - 1;
        
        //Traversing from right to left to find the first zero
        while (res[n] == '1'){
            res[n] = '0';
            
            //If the entire string consists of ones
            if (n == 0){
                return 1 + new String(res);
            }
            
            n -= 1;
        }
        
        //replacing the first '0' by '1'
        res[n] = '1';
        
        return new String(res);
    }
}