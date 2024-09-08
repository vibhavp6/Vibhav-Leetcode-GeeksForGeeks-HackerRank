//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
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

            System.out.println(new Solution().minJumps(arr));
            // System.out.println("~");
        }
    }
}

// } Driver Code Ends

class Solution {
    static int minJumps(int[] arr) {
        // your code here
        
        int jumps=0;
        int currentIndex=0;
        int farIndex=0;
        
        //if arr length is 0 or 1st element is 0
        if(arr.length==0 || arr[0]==0) return -1;
        
        //for length 1
        else if(arr.length==1) return 1;
        
        else {
            for(int i=0; i<arr.length-1; i++){
                farIndex=Math.max(farIndex, i+arr[i]);
                
                if(i==currentIndex){
                    jumps++;
                    currentIndex=farIndex;
                    
                    if(currentIndex>=arr.length-1) return jumps;
                    
                }
                
            }
        }
        return -1;
    }
}

