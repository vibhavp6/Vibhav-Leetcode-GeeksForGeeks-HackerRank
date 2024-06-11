//{ Driver Code Starts
import java.io.*;
import java.util.*;

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

            int x;
            x = Integer.parseInt(br.readLine());

            int y;
            y = Integer.parseInt(br.readLine());

            int[] arr = IntArray.input(br, n);

            int[] brr = IntArray.input(br, n);

            Solution obj = new Solution();
            long res = obj.maxTip(n, x, y, arr, brr);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        // code here
         return optimum(arr, brr, x, y, n);
        
    }
    
    // greedy
    static class Order{
        int a_tip;
        int b_tip;
        int diff;
        
        Order(int a_tip, int b_tip){
           this.a_tip = a_tip;
           this.b_tip = b_tip;
           this.diff = Math.abs(a_tip - b_tip);
        }
    }
    
    static long optimum(int arr[], int brr[], int x, int y, int n){
        
        ArrayList<Order> orders = new ArrayList<>();
        for(int i = 0; i < n; i++){
            orders.add(new Order(arr[i], brr[i]));
        }
        
        Collections.sort(orders, (o1, o2) -> Integer.compare(o1.diff, o2.diff));
        
        long ans = 0;
        for(int i = n - 1; i >= 0; i--){
            Order o = orders.get(i);
            if((o.a_tip >= o.b_tip && x > 0) || y <= 0){
                ans += o.a_tip;
                x--;
            }else{
                ans += o.b_tip;
                y--;
            }
            
        }
        
        return ans;
    }
}
