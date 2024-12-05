//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            int a[] = new int[inputArray.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(inputArray[i]);

            Solution ob = new Solution();
            ob.sort012(a);

            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}


// } Driver Code Ends

class Solution {
    public void sort012(int[] nums) {
    int left = 0, current = 0, right = nums.length - 1;

    while (current <= right) {
        if (nums[current] == 0) {
            // Swap current element with left pointer
            int temp = nums[current];
            nums[current] = nums[left];
            nums[left] = temp;

            left++;
            current++;
        } else if (nums[current] == 1) {
            current++;
        } else {
            // Swap current element with right pointer
                int temp = nums[current];
                nums[current] = nums[right];
                nums[right] = temp;
    
                right--;
            }
        }
    }
}

//{ Driver Code Starts.
// } Driver Code Ends