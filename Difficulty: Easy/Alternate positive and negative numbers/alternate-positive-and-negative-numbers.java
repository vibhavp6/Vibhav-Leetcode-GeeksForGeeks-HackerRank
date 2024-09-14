//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        int n = arr.size();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        //Store all +ve and -ve element
        
        for(int i = 0;i<n;++i){
            if(arr.get(i)>=0) arr1.add(arr.get(i));
            else
            arr2.add(arr.get(i));
        }
        
        //Store any difrent list all numbers
        
        ArrayList<Integer> a = new ArrayList<>();
       
        int p=arr1.size();
        int N=arr2.size();
        int j = 0,k =0;
        for(int i = 0;i<n;i++){
            if(j<p){
                a.add(arr1.get(j));
                j++;
            } 
            if(k<N) {
                a.add(arr2.get(k));
                k++;
            }
        }
        
        // change arr elements
        
      for(int i = 0;i<n;i++){
          arr.set(i,a.get(i));
      }
    }
}