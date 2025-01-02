//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String line = br.readLine().trim();

            Solution obj = new Solution();

            System.out.println(obj.getMaxOccuringChar(line));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution {
    // Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line) {
        HashMap<Character, Integer> cc = new HashMap<>();
        int max = 0;
        char maxChar = ' '; 

        for (char c : line.toCharArray()) {
            cc.put(c, cc.getOrDefault(c, 0) + 1);
        }

        for (char c : cc.keySet()) {
            int count = cc.get(c);
            if (count > max || (count == max && c < maxChar)) {
                max = count;
                maxChar = c;
            }
        }
        
        return maxChar; 
    }
}
