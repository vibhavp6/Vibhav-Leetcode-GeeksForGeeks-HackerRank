//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.ArrayList;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.getPrimes(n);

            IntArray.print(res);
        }
    }
}

// } Driver Code Ends




class Solution {
    public static boolean isPrime(int number) {
        // Check for less than 2 (0 and 1 are not prime numbers)
        if (number <= 1) 
            return false;
        
        // Check for factors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) 
                return false; // Found a factor, not a prime number
        }
        
        return true; // No factors found, it's a prime number
    }
    public static ArrayList<Integer> getPrimes(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 2;i<(n/2 + 1);i++){//as we know 4 + 6 = 10 = 6 + 4 as well
            if(isPrime(i) && isPrime(n-i)){
                    ans.add(i);
                    ans.add(n-i);
                    return ans;
            }
        }

        if(ans.isEmpty()){//not found
            ans.add(-1);
            ans.add(-1);
        }
        return ans;
    }
}
