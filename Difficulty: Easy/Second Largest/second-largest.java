//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.print2largest(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int print2largest(int[] arr) {
        // Code Here
        int m1 = -1;
        int m2 = -1;
        
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] > m1) {
                m2  =m1;
                m1 = arr[i]; 
            } else if  ( arr[i] > m2 && m1 != arr[i]){
                m2 = arr[i];
            }
        }
        return m2;
        
    }
}