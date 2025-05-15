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
            int result = ob.countSubstring(s);

            System.out.println(result);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int countSubstring(String s) {
        // code here
        Map<Character, Integer> freqMap = new HashMap<>();
        int count = 0;

        // Traverse the string
        for (char ch : s.toCharArray()) {
            // If the character is already in the map, add its count to the result
            count += freqMap.getOrDefault(ch, 0);

            // Increment the frequency of the character
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Each single character is a valid substring
        count += s.length();

        return count;
    }
}