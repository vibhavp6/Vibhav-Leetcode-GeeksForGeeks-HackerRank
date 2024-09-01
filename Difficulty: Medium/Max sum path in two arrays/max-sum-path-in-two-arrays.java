//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the remaining newline

        for (int k = 0; k < t; k++) {
            List<Integer> arr1 = new ArrayList<>();
            String input = sc.nextLine();
            Scanner lineScanner = new Scanner(input);
            while (lineScanner.hasNextInt()) {
                arr1.add(lineScanner.nextInt());
            }
            lineScanner.close();

            List<Integer> arr2 = new ArrayList<>();
            input = sc.nextLine();
            lineScanner = new Scanner(input);
            while (lineScanner.hasNextInt()) {
                arr2.add(lineScanner.nextInt());
            }
            lineScanner.close();

            Solution ob = new Solution();
            int ans = ob.maxPathSum(arr1, arr2);
            System.out.println(ans);
        }

        sc.close();
    }
}

// } Driver Code Ends



class Solution {
    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        // code here
        int m = arr1.size();
        int n = arr2.size();
        
        int ptr1 = 0;
        int ptr2 = 0;
        
        int sum1 = 0;
        int sum2 = 0;
        
        int maxSum = 0;
        
        while (ptr1 < m && ptr2 < n) {
            int x = arr1.get(ptr1);
            int y = arr2.get(ptr2);
            
            if (x != y) {
                if (x > y) {
                    sum2 += y;
                    ptr2++;
                } else {
                    sum1 += x;
                    ptr1++;
                }
            } else {
                sum1 += x;
                sum2 += y;
                
                maxSum += Math.max(sum1, sum2);
                // Treating it the same way considering your array starts after the common element
                sum1 = sum2 = 0;
                
                ptr1++;
                ptr2++;
            }
        }
        
        // Handling the case where no common elements will be found afterward.
        while (ptr1 < m) {
            sum1 += arr1.get(ptr1++);
        }
        
        while (ptr2 < n) {
            sum2 += arr2.get(ptr2++);
        }
        
        maxSum += Math.max(sum1, sum2);
        
        return maxSum;
    }
}