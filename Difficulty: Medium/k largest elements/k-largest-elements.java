//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.HashMap;


// } Driver Code Ends
class Solution {
    public static int largest(int[]arr,int num){
        int l = num;
        for(int i = 0; i<arr.length; i++){
            if (arr[i]>l){
                l = arr[i];
                
            }
        }
        for (int i = 0; i<arr.length; i++){
            if(arr[i] == l){
                arr[i]  = Integer.MIN_VALUE;
                break;
            }
        }
        return l;
    }
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int val = Integer.MIN_VALUE;
        int val2;
        for(int i = 0; i<k; i++){
          val2 = largest(arr,val);
          a.add(val2);
        }
        
        return a;
    }
}


//{ Driver Code Starts.
public class Main {

    public static void main(String[] args) throws Exception {
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

            int k = Integer.parseInt(br.readLine());
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.kLargest(arr, k);

            // Print the result as a space-separated string
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println(); // New line after printing the results
            System.out.println("~");
        }
    }
}

// } Driver Code Ends