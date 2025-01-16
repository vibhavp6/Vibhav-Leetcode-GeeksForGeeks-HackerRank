//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create BufferedReader for efficient input reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read number of test cases
        int T = Integer.parseInt(br.readLine());

        // Process each test case
        while (T-- > 0) {
            // Read the entire line containing the array elements
            String line = br.readLine();

            // Split the line into an array of strings, then parse them as integers
            String[] tokens = line.split("\\s+");
            int[] a = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                a[i] = Integer.parseInt(tokens[i]);
            }

            // Create the Solution object
            Solution obj = new Solution();

            // Call maxLen function and print the result
            System.out.println(obj.maxLen(a));
        }
    }
}
// } Driver Code Ends


class Solution {
    public int maxLen(int[] arr) {
        int count = 0;
        int o = 0;
        // Create a HashMap to store the first occurrence of a given count
        Map<Integer, Integer> map = new HashMap<>();
        // Initialize with 0, because an equal number of 0's and 1's can start from the beginning
        map.put(0, -1);
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                o++;
            } else {
                o--;
            }
            
            // If the count has been seen before, calculate the length of the subarray
            if (map.containsKey(o)) {
                count = Math.max(count, i - map.get(o));
            } else {
                // Otherwise, store the first occurrence of the count
                map.put(o, i);
            }
        }
        return count;
    }
}