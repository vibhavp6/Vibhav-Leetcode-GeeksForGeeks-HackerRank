//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(br.readLine().trim());

        while (test_cases-- > 0) {
            // Read the array from input line
            String[] input = br.readLine().trim().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            // Solution instance to invoke the function
            Solution ob = new Solution();
            int result = ob.hIndex(arr);

            System.out.println(result);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int maxCitation = 0;
        for (int citation : citations) {
            maxCitation = Math.max(maxCitation, citation);
        }
        int[] count = new int[maxCitation + 2];
        for (int citation : citations) {
            count[0]++;
            count[citation + 1]--;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = count.length - 1; i >= 0; i--) {
            if (count[i] >= i) {
                return i;
            }
        }
        return 0;
    }
}