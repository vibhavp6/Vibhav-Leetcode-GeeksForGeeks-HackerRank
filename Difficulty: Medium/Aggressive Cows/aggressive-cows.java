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
            int ans = sln.aggressiveCows(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int check (int mid , int [] stalls , int k) {
        int n = stalls.length;
        int count = 1;
        int prev =stalls[0];
        for (int i = 0; i<n; i++) {
            if(stalls[i] - prev >= mid) {
                count++;
                prev = stalls[i];
            }
            if (count>=k) return 1;
        }
        return 0;
        
    }
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n = stalls.length;
        int left = 1, right = stalls[n-1] - stalls[0] , ans =-1;
        while (left<=right) {
            int mid = left + (right-left)/2;
            int flag = check(mid,stalls,k);
            if (flag == 1) {
                ans = mid;
                left = mid +1;
            }
            else {
                right = mid -1;
            }
        }
        return ans;
    }
}