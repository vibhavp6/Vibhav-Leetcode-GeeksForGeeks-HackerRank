//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] words = sc.nextLine().trim().split(" ");
            Solution obj = new Solution();
            int res = obj.longestStringChain(words);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int longestStringChain(String words[]) {
        Arrays.sort(words, (a, b) -> a.length() - b.length()); // Sort words by length
        
        Map<String, Integer> dp = new HashMap<>(); // Stores the longest chain ending at each word
        int maxLength = 1;
        
        for (String word : words) {
            int best = 1;
            for (int i = 0; i < word.length(); i++) {
                String predecessor = word.substring(0, i) + word.substring(i + 1); // Remove one character
                best = Math.max(best, dp.getOrDefault(predecessor, 0) + 1);
            }
            dp.put(word, best);
            maxLength = Math.max(maxLength, best);
        }
        
        return maxLength;
    }
}