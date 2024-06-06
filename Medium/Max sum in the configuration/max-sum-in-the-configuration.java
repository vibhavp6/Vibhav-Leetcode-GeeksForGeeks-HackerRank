//{ Driver Code Starts
import java.util.*;

class Maxsum_Among_All_Rotations_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            System.out.println(new Solution().max_sum(arr, n));

            t--;
        }
    }
}

// } Driver Code Ends


class Solution {
    long max_sum(int a[], int n) {
        // Your code here
        long temp = 0;    //to store the index based sum of each iteration
        long sum = 0;     //to store the sum of array elements
        long ans = 0;      //to store the final maximum ans
        
        for (int i = 0; i < n; i++) {
            sum += (long)a[i];
            temp += (long)a[i] * (long)i;
        }
        
        ans = temp;
        
        for (int i = 1; i < n; i++) {      //calculating changing sum for each iteration
            temp = temp - sum + ((long)a[i - 1] * n);
            ans = Math.max(temp, ans);
        }
        
        return ans;
    }
}