//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        while (T > 0) {
            String[] input = sc.nextLine().trim().split(" ");
            int[] a = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                a[i] = Integer.parseInt(input[i]);
            }
            Solution ob = new Solution();
            ob.segregateElements(a);
            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            T--;
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        int n =arr.length;
        int j =0;
        int [] arr1 = new int [n];
        for (int i = 0; i<n; i++) {
            if (arr[i]>= 0) {
                arr1[j++] = arr[i];
            }
        }
        
        for (int i = 0; i<n; i++) {
            if (arr[i] < 0) {
                arr1[j++] = arr[i]; 
            }
        }
        
        for (int i = 0; i<n; i++) {
            arr[i] = arr1[i];
        }
    }
    
}