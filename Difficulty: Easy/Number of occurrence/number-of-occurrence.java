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
            int ans = sln.countFreq(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int countFreq(int[] nums, int target) {
        // code here
        int [] ans =  new int [2];
        ans[0] = -1; 
        ans[1] = -1;
        
        int left = 0, right  = nums.length-1;
        while (left<=right) {
            int mid = left + (right-left)/2;
            if(nums[mid] == target) {
                ans [0] = mid;
                right = mid -1;
            }
            else if(nums[mid] < target) left = mid +1;
            else {
                right = mid-1;
            }
        }
        int lef = 0, righ  = nums.length-1;
        while (lef<=righ) {
            int mid = lef + (righ-lef)/2;
            if(nums[mid] == target) {
                ans [1] = mid;
                lef = mid + 1;
            }
            else if(nums[mid] < target) lef = mid +1;
            else {
                righ = mid-1;
            }
        }
        if(ans[0] == -1) return 0;
        return (ans[1] - ans [0] +1);
    }
}
