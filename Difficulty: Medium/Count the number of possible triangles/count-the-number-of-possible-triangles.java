//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().countTriangles(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        int n = arr.length;

        // If there are fewer than 3 sides, no triangle can be formed.
        if (n < 3) return 0;

        // Sort the array in ascending order
        Arrays.sort(arr);

        int count = 0;

        // Fix the third side (largest side of the triangle)
        for (int k = n - 1; k >= 2; k--) {
            int i = 0; // Start pointer
            int j = k - 1; // End pointer before the largest side

            // Check pairs (i, j) such that arr[i] + arr[j] > arr[k]
            while (i < j) {
                if (arr[i] + arr[j] > arr[k]) {
                    // All pairs between i and j can form a triangle with arr[k]
                    count += (j - i);
                    j--; // Decrease j to check smaller pairs
                } else {
                    i++; // Increase i to increase the sum
                }
            }
        }

        return count;
    }
}