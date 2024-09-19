//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
           
       String[] word = S.split("\\.");
        
        StringBuilder  revString =new StringBuilder("");
        for(int i=word.length-1;i>=0;i--)
        {
            revString.append(word[i]) ; 
            if(i>0)
            {
                revString.append(".");
            }
            
        }
        
        
        return revString.toString();
    }
}

