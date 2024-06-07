//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            // taking size of array
            int n = Integer.parseInt(br.readLine().trim());
            int l[] = new int[n];
            int r[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");

            // adding elements to array L
            for (int i = 0; i < n; i++) {
                l[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int maxx = Integer.MIN_VALUE;

            // adding elements to array R
            for (int i = 0; i < n; i++) {
                r[i] = Integer.parseInt(inputLine[i]);
                if (r[i] > maxx) {
                    maxx = r[i];
                }
            }

            Solution obj = new Solution();

            // calling maxOccured() function
            System.out.println(obj.maxOccured(n, l, r, maxx));
        }
    }
}


// } Driver Code Ends
// L[] and R[] are input ranges
// n : size of array
// maxx: maximum element in R[]
// arr[]: declared globally with size equal to 1000000

class Solution {
    // Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int n, int l[], int r[], int maxx) {
        int arr[]=new int[maxx+2];
        for(int i=0;i<n;i++){
            arr[l[i]]=arr[l[i]]+1;
            arr[r[i]+1]=arr[r[i]+1]-1;
        } 
        
        for(int i=1;i<arr.length;i++) {
        	arr[i]=arr[i]+arr[i-1];
        }
      
        
        int ans=1;
        int fre=arr[1];
        
        for(int i=0;i<arr.length;i++) {
        	if(fre<arr[i]) {
        		fre=arr[i]; 
        		ans=i;
        	}
        }       
      
        return ans;
    }
}

//{ Driver Code Starts.

// } Driver Code Ends