//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
        int t = Integer.parseInt(br.readLine().trim()); 
        while(t-->0){
            
            //size of array
            int N = Integer.parseInt(br.readLine().trim()); 
            int arr[] = new int[N];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements to the array
            for(int i = 0 ; i < N; i++){
                arr[i]=Integer.parseInt(inputLine[i]); 
            }
            int P= Integer.parseInt(br.readLine().trim());
            //calling frequncycount() function
            Solution ob = new Solution();
            ob.frequencyCount(arr, N, P); 
            
            //printing array elements
            for(int i = 0; i < N ; i++)
                System.out.print(arr[i] + " " );
            System.out.println();
        }
    }
}




// } Driver Code Ends


class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
         HashMap<Integer, Integer> frequency = new HashMap<>();

        // Traverse the array and count the frequencies of elements.
        for (int i = 0; i < N; ++i) {
            if (arr[i] <= N) {  // Ignore elements greater than N
                frequency.put(arr[i], frequency.getOrDefault(arr[i], 0) + 1);
            }
        }

        // Update the array with the frequencies of elements from 1 to N.
        for (int i = 1; i <= N; i++) {
            arr[i - 1] = frequency.getOrDefault(i, 0);
        }
    }
}
