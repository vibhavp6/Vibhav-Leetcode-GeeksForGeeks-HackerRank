//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> nums) {
        int left = 0, right = nums.size() - 1, ans = Integer.MAX_VALUE;
        int fans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums.get(left) <= nums.get(mid)) {
                ans = Math.min(ans, nums.get(left));
                left = mid + 1;
            } else {
                ans = Math.min(ans, nums.get(mid));
                right = mid - 1;
            }
        }

        fans = nums.indexOf(ans);
        return fans;
    }
}
