//{ Driver Code Starts
import java.util.*;

public class GFG {
    // Function to check if v2 is a subsequence of v1
    public static boolean isSubSequence(int[] v1, int[] v2) {
        int m = v2.length;
        int n = v1.length;
        int j = 0; // For index of v2

        // Traverse v1 and v2
        for (int i = 0; i < n && j < m; i++) {
            if (v1[i] == v2[j]) {
                j++;
            }
        }
        return j == m;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String[] input = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
            int n = arr.length;
            Solution obj = new Solution();
            List<Integer> res = obj.find3Numbers(arr);
            if (!res.isEmpty() && res.size() != 3) {
                System.out.println(-1);
            } else {
                int[] resArray = res.stream().mapToInt(Integer::intValue).toArray();
                if (resArray.length == 0) {
                    System.out.println(0);
                } else if (resArray[0] < resArray[1] && resArray[1] < resArray[2] &&
                           isSubSequence(arr, resArray)) {
                    System.out.println(1);
                } else {
                    System.out.println(-1);
                }
            }
        }
        sc.close();
    }
}

// } Driver Code Ends


/*Complete the function below*/


class Solution {
    /**
     * This method finds the first element in the array that has a smaller element on its left and a larger element on its right.
     * It returns a list containing the left smaller element, the element itself, and the right larger element.
     *
     * @param arr the input array of integers
     * @return a list of integers containing the left smaller element, the element itself, and the right larger element
     */
    public List<Integer> find3Numbers(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int[] lr = new int[n]; // Array to store the left smaller elements
        int[] rl = new int[n]; // Array to store the right larger elements
        
        // Initialize the left smaller array
        lr[0] = -1;
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
            if (min < arr[i]) {
                lr[i] = min;
            } else {
                lr[i] = -1;
            }
        }
        
        // Initialize the right larger array
        rl[n - 1] = -1;
        int max = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            max = Math.max(max, arr[i]);
            if (max > arr[i]) {
                rl[i] = max;
            } else {
                rl[i] = -1;
            }
        }
        
        // Find the first element with a smaller left and larger right
        for (int i = 1; i < n - 1; i++) {
            if (lr[i] != -1 && rl[i] != -1) {
                ans.add(lr[i]);
                ans.add(arr[i]);
                ans.add(rl[i]);
                break;
            }
        }
        
        return ans;
    }
}