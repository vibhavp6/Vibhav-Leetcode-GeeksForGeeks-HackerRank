//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
class Solution {
    int findEquilibrium(int[] arr) {
        // code
        int total = 0;
        int left  =0;
        for (int i =0; i<arr.length; i++) {
            total += arr[i];
        }
        
        for (int i = 0; i<arr.length; i++) {
            left += arr[i];
            if (total == left) return i;
            total -= arr[i];
        }
        return -1;
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
            int res = obj.findEquilibrium(arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends