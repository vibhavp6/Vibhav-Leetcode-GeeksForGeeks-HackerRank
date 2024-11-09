//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String arr[] = br.readLine().split(" ");
            int a[] = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                a[i] = Integer.parseInt(arr[i]);
            }
            Solution obj = new Solution();
            int f = 0;
            String A = obj.minSum(a);
            System.out.println(A);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    String minSum(int[] arr) {
        // code here
        Arrays.sort(arr);
         StringBuilder st=new StringBuilder();
        int carry=0;
        for(int i=arr.length-1;i>=0;i-=2){
            if(arr[i]+carry==0) break;
            if(i-1>=0){
                if(arr[i]+arr[i-1]+carry>9){
                    st.append((arr[i]+arr[i-1]+carry)%10);
                     carry=1;
                }
                else {st.append(arr[i]+arr[i-1]+carry); carry=0;}
            }
            else{
                    st.append(carry+arr[i]);
                    carry=0;
            }
        }
        if(carry>0) st.append(carry);
        return st.reverse().toString();
        
    }
}
