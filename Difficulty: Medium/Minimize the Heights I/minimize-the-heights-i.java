//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the number of test cases (t)
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine().trim());
            String input = br.readLine().trim();

            // Split the input line into integers and store them in the array
            String[] tokens = input.split(" ");
            int[] arr = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }

            // Create an instance of the Solution class
            Solution ob = new Solution();

            // Call the getMinDiff method
            int res = ob.getMinDiff(k, arr);

            // Print the result
            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public int getMinDiff(int k, int[] arr) {
        // code hereint 
        int n = arr.length;
        if (n == 1) {
            return 0; // Single tower, no difference
        }
        
        // Sort the array
        Arrays.sort(arr);
        
        // Initial difference
        int initialDiff = arr[n - 1] - arr[0];
        int minDiff = initialDiff;
        
        // Base heights after adding/subtracting k
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;
        
        // Traverse through the sorted array
        for (int i = 1; i < n; i++) {
            int minHeight = Math.min(smallest, arr[i] - k);
            int maxHeight = Math.max(largest, arr[i - 1] + k);
            minDiff = Math.min(minDiff, maxHeight - minHeight);
        }
        
        return minDiff;
    }
}