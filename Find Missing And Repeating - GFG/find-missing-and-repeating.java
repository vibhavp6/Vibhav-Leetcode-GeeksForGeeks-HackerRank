//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] result = new int[2]; // results
        int[] count = new int[n+1]; // to count the frequency 

        // Count the frequency of each number
        for (int i=0; i<n; i++) {
            count[arr[i]]++;
        }

        // check for missing and repeating number
        for(int i=1; i<=n; i++){
            if(count[i]==0){
               result[1]=i;  // missing no.
           }
           if(count[i]==2){
               result[0]=i;  // repeating no.
           }
        }
        return result;
    }
}
