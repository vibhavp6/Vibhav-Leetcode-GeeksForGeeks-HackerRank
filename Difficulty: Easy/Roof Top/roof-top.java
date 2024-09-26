//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class gfg {

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String st[] = read.readLine().trim().split("\\s+");
            int n = st.length;
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) arr[(int)i] = Integer.parseInt(st[(int)i]);

            System.out.println(new Solution().maxStep(arr));
        }
    }
}

// } Driver Code Ends



class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        int n = arr.length;
        int count = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i<n-1; i++){
            if(arr[i+1] > arr[i]){
                count++;
            }
            else{
                maxi = Math.max(maxi, count);
                count = 0;
            }
        }
        maxi = Math.max(maxi, count);
        return maxi;
    }
}

