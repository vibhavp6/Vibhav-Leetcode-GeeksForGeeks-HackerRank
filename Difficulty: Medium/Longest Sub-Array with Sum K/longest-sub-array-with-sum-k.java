//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        // looping through all testcases
        while (testcases-- > 0) {
            String line = br.readLine();
            String[] element = line.trim().split("\\s+");
            int sizeOfArray = Integer.parseInt(element[0]);
            int K = Integer.parseInt(element[1]);

            int arr[] = new int[sizeOfArray];

            line = br.readLine();
            String[] elements = line.trim().split("\\s+");
            for (int i = 0; i < sizeOfArray; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            Solution obj = new Solution();
            int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
//import java.util.HashMap;

class Solution {
    // Function for finding the length of the longest subarray with sum K
    public static int lenOfLongSubarr(int A[], int N, int K) {
        // Map to store (prefix sum, first occurrence index)
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;  // Variable to store the running sum
        int maxLen = 0;  // Variable to store the maximum length of the subarray
        
        for (int i = 0; i < N; i++) {
            sum += A[i];
            
            // Check if the current sum itself is equal to K
            if (sum == K) {
                maxLen = i + 1;
            }
            
            // If (sum - K) is found in the map, it means there is a subarray with sum K
            if (map.containsKey(sum - K)) {
                maxLen = Math.max(maxLen, i - map.get(sum - K));
            }
            
            // If the current sum is not in the map, add it with its index
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        
        return maxLen;
    }
}

