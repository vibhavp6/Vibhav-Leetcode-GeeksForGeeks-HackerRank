//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            ArrayList<Integer> array2 = new ArrayList<Integer>();

            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            line = read.readLine();
            tokens = line.split(" ");
            for (String token : tokens) {
                array2.add(Integer.parseInt(token));
            }

            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr1 = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr1[idx++] = i;

            int[] arr2 = new int[array2.size()];
            idx = 0;
            for (int i : array2) arr2[idx++] = i;

            v = new Solution().intersection(arr1, arr2);

            if (v.size() > 0) {
                for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");
            } else {
                System.out.print("[]");
            }

            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java



class Solution {
    // Function to return a list containing the intersection of two arrays.
    static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();
        
        // Add all elements of arr1 to the first HashSet
        for (int num : arr1) {
            hs.add(num);
        }
        
        // Add elements from arr2 that are present in hs to hs1
        for (int num : arr2) {
            if (hs.contains(num)) {
                hs1.add(num);
            }
        }
        
        // Convert the HashSet hs1 to a sorted ArrayList
        ArrayList<Integer> result = new ArrayList<>(hs1);
        Collections.sort(result);  // Sort the ArrayList in natural order
        
        return result;  // Return the sorted ArrayList
    }
}

