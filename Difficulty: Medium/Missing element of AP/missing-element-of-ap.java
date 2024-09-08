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
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int findMissing(int[] arr) {
        int n = arr.length;
        int first = arr[0];
        int last = arr[n-1];
        int num = 0;
        int diff = (last - first) / n;

        for (int i = 1; i < n; i++) {
            if (arr[i] != (arr[i-1] + diff)) {
                num = arr[i-1] + diff;
                break;
            }
        }
        return num;
    }
}
