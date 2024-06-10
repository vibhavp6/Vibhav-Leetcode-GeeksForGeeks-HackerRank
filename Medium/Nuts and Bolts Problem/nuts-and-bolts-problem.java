//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            char[] nuts = new char[n], bolts = new char[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                nuts[i] = (inputLine[i].charAt(0));
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                bolts[i] = (inputLine[i].charAt(0));
            }

            new Solution().matchPairs(n, nuts, bolts);
            for (int i = 0; i < n; i++) {
                System.out.print(nuts[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(bolts[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void matchPairs(int n, char nuts[], char bolts[]) {
        // code here
                char[] order = {'!', '#', '$', '%', '&', '*', '?', '@', '^'};

        // Use a HashSet to store nuts for quick lookup
        HashSet<Character> nutsSet = new HashSet<>();

        // Add all nuts to the HashSet
        for (int i = 0; i < n; i++) {
            nutsSet.add(nuts[i]);
        }

        int index = 0;

        // Iterate through the predefined order and match nuts and bolts
        for (char c : order) {
            if (nutsSet.contains(c)) {
                // Place the nut and bolt in the correct position
                nuts[index] = c;
                bolts[index] = c;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5;
        char[] nuts = {'@', '%', '$', '#', '^'};
        char[] bolts = {'%', '@', '#', '$', '^'};

        solution.matchPairs(n, nuts, bolts);

        // Output the sorted nuts and bolts
        System.out.println("Nuts: " + new String(nuts));
        System.out.println("Bolts: " + new String(bolts));
    }
}