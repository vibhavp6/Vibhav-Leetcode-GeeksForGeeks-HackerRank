//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.HashMap;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int k = Integer.parseInt(br.readLine());

            ArrayList<Integer> ans = new Solution().countDistinct(arr, k);

            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

            t--;
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
         ArrayList<Integer> ans = new ArrayList<>();
         HashMap<Integer,Integer> mpp = new HashMap<>();
         int st = 0;
         for(int i = 0; i<arr.length; i++){
             mpp.put(arr[i] , mpp.getOrDefault(arr[i] , 0 ) +1);
             if(i-st+1 == k) {
                 ans.add(mpp.size());
                 mpp.put(arr[st] , mpp.get(arr[st]) -1);
                 if(mpp.get(arr[st]) == 0){
                     mpp.remove(arr[st]);
                 }
                 st++;
             }
         }
         return ans;
    }
}
