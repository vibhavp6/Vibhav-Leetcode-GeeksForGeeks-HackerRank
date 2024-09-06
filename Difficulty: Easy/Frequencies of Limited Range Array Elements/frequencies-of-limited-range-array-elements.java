//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // testcases
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {

            // size of array
            int N = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[N];
            String inputLine[] = br.readLine().trim().split(" ");

            // adding elements to the array
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int P = Integer.parseInt(br.readLine().trim());
            // calling frequncycount() function
            Solution ob = new Solution();
            ob.frequencyCount(arr, N, P);

            // printing array elements
            for (int i = 0; i < N; i++) System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
        // Create a HashMap to store the frequency of elements
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of elements that are in the range 1 to N
        for (int i = 0; i < N; i++) {
            // Only consider elements in the range 1 to N
            if (arr[i] >= 1 && arr[i] <= N) {
                // Use getOrDefault to increment the count for arr[i]
                frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
            }
        }

        // Update the array in place with the frequency of each number from 1 to N
        for (int i = 1; i <= N; i++) {
            // Set arr[i-1] to the frequency of i, or 0 if i is not present
            arr[i - 1] = frequencyMap.getOrDefault(i, 0);
        }
    }
}

