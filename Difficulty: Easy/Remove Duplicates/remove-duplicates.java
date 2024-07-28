//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            Solution ob = new Solution();
            String result = ob.removeDups(s);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String removeDups(String str) {
       
       // LinkedHashSet maintains insertion order and ensures uniqueness 
        Set<Character>  charSet = new  LinkedHashSet<>();
        
       // Convert string to char array for easier iteration
        char[]  strArray = str.toCharArray();
       
       // Add each character to the set
      // Duplicates are automatically not added due to set property 
        for(char eachLetter : strArray){
            charSet.add(eachLetter);
        }
        
      // StringBuilder for efficient string construction
        StringBuilder  sb = new StringBuilder();
        
    // Append each unique character to the StringBuilder
    // Order is preserved due to LinkedHashSet
        for(char ch : charSet){
            sb.append(ch);
        }
        
         // Convert StringBuilder to String and return
        return sb.toString();
    }
}

