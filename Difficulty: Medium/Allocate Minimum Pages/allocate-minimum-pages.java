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
    public static int findPages(int[] nums, int m) {

        int n = nums.length;
        if(m > n){
            return -1;
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start,nums[i]);
            end += nums[i];
        }
        // binary search
        while (start<end){
            int mid = start+ (end -start)/2;
            int sum = 0;
            int pieces = 1;
            for(int num: nums){
                if (sum+num > mid){
                    sum = num;
                    pieces++;

                }  else {
                    sum+= num;
                }
            }
            if(pieces>m){
                start= mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
 