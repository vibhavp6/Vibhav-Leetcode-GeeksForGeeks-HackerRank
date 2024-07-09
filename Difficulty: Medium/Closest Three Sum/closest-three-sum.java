//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String line = in.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int key = Integer.parseInt(in.readLine().trim());

            out.println(new Solution().threeSumClosest(arr, key));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int threeSumClosest(int[] array, int target) {
        // code here
        Arrays.sort(array);
        int n=array.length;
        int diff=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<n;i++){
            int l=i+1,r=n-1;
            while(l<r){
                int val=array[i]+array[l]+array[r];
                if(val==target){
                    return target;
                }else if(val>target){
                    r--;
                }else{
                    l++;
                }
                if(Math.abs(val-target)==diff){
                    ans=Math.max(val,ans);
                }else{
                    if(diff>Math.abs(val-target)){
                        diff=Math.abs(val-target);
                        ans=val;
                    }
                }
            }
            
        }
        return ans;
        
    }
}