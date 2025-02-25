//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

class Solution {
    public static int getMaxArea(int arr[]) {
        // your code here
       int n = arr.length;
        int[] left = new int[n], right = new int[n]; // Arrays to store the nearest smaller elements
        Stack<Integer> st = new Stack<>(); // Stack to help find the nearest smaller elements

        // Left pass: Find the nearest smaller element to the left of each bar
        left[0] = -1; // No smaller element to the left of the first bar
        st.push(0);

        for (int i = 1; i < n; i++) {
            // Pop elements from the stack until we find a smaller element
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            // If stack is empty, no smaller element to the left
            left[i] = (st.isEmpty() ? -1 : st.peek());
            st.push(i); // Push the current index to the stack
        }

        // Clear the stack for the right pass
        st.clear();

        // Right pass: Find the nearest smaller element to the right of each bar
        right[n - 1] = n; // No smaller element to the right of the last bar
        st.push(n - 1);

        for (int i = n - 2; i >= 0; i--) {
            // Pop elements from the stack until we find a smaller element
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            // If stack is empty, no smaller element to the right
            right[i] = (st.isEmpty() ? n : st.peek());
            st.push(i); // Push the current index to the stack
        }

        // Calculate the maximum area
        int ans = 0;
        for (int i = 0; i < n; i++) {
            // Calculate the width of the rectangle
            int width = right[i] - left[i] - 1;
            // Calculate the area of the rectangle
            int curr = width * arr[i];
            // Update the maximum area
            ans = Math.max(ans, curr);
        }

        return ans; // Return the maximum area
    }
}




//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.getMaxArea(arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends