//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {

    public boolean isValid(String str) {
        // Write your code here
        String[] address=str.split("[.]");
        
        if(address.length<4){
            return false;
        }
        
        for(int i=0;i<address.length;i++){
            if(address[i].length()==0 || address[i].length()>4){
                return false;
            }
            
            if(address[i].length()!=1 && address[i].charAt(0)=='0'){
                return false;
            }
            
            int curr=convert(address[i]);
            
            if(curr>255){
                return false;
            }
        }
        return true;
    }
    
    public int convert(String input){
        int N=input.length();
        int ans=0;
        for(int i=N-1;i>=0;i--){
            int curr=input.charAt(i)-'0';
            int power= (int) Math.pow(10,N-1-i);
            ans=ans+curr*power;
        }
        return ans;
        
    }
}