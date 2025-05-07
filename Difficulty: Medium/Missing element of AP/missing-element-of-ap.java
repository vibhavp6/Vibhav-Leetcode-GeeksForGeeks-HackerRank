//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        Solution solution = new Solution();
        while (t-- > 0) {
            String input = reader.readLine().trim();
            String[] parts = input.split("\\s+");
            int[] arr = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();

            System.out.println(solution.findMissing(arr));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findMissing(int[] arr) {
        int n = arr.length;
       
        int prevDiff = arr[1] - arr[0];
        
      
        for (int i = 2; i < n; i++) {
            int currDiff = arr[i] - arr[i - 1];
            if (currDiff != prevDiff) {
               
                return arr[i - 1] + prevDiff;
            }
        }
        
       
        return arr[n - 1] + prevDiff;
    }
}
