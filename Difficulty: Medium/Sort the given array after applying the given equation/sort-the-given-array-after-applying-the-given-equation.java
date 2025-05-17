//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read number of test cases
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            // Read the array line and convert to int[]
            String input = br.readLine().trim();
            String[] tokens = input.split("\\s+");
            int n = tokens.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }

            // Read a, b, c from separate lines
            int a = Integer.parseInt(br.readLine().trim());
            int b = Integer.parseInt(br.readLine().trim());
            int c = Integer.parseInt(br.readLine().trim());

            // Call the solution method
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.sortArray(arr, a, b, c);

            // Output the result
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends

class Solution {
    public ArrayList<Integer> sortArray(int[] arr, int A, int B, int C) {
        int n = arr.length;
        int[] res = new int[n];
        int i = 0, j = n - 1;
        int idx = (A >= 0) ? n - 1 : 0;

        while (i <= j) {
            int x = arr[i], y = arr[j];
            int val1 = A * x * x + B * x + C;
            int val2 = A * y * y + B * y + C;

            if (A >= 0) {
                if (val1 > val2) {
                    res[idx--] = val1;
                    i++;
                } else {
                    res[idx--] = val2;
                    j--;
                }
            } else {
                if (val1 < val2) {
                    res[idx++] = val1;
                    i++;
                } else {
                    res[idx++] = val2;
                    j--;
                }
            }
        }

        ArrayList<Integer> resultList = new ArrayList<>(n);
        for (int val : res) resultList.add(val);
        return resultList;
    }
}