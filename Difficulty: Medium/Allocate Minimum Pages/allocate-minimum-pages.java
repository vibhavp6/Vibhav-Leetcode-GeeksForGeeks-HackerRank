//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.findPages(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends



//Back-end complete function Template for Java

class Solution {
 public int check (int mid, int [] arr ,int days) {
        int day = 1;
        long sum = 0;
        for (int i = 0; i<arr.length; i++) {
            if (sum + arr[i] > mid) {
                day++;
                sum = arr[i];
            }
            else {
                sum += arr[i];
            }
            if (day > days) return 1; 
        }
        return 0;
    }
    public int findPages(int[] arr, int days) {
        if(arr.length < days) return -1;
        int sumr = 0, suml = arr[0], left = -1, right = -1, ans = -1;
        for (int i = 0 ; i<arr.length; i++) {
            sumr += arr[i]; 
            if(arr[i] > suml) suml = arr[i];
        }
        right = sumr;
        left = suml;


        while (left<=right) {
            int mid = left + (right-left)/2;
            int flg = check(mid,arr,days);

            if(flg == 1) {
                left = mid+1;
            }
            else {
                ans = mid;
                right = mid-1;
            }
        }
        return ans;
    }
}