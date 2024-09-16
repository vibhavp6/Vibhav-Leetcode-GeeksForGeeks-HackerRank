//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String S){
        int n = S.length();
        int[] dp = new int[n];
        Arrays.fill(dp, 0);
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        int currMax = 0;
        for(int i = 0; i < n; i++){
            if(!st.isEmpty()){
                char curr = S.charAt(i);
                int tidx = st.peek();
                char top = S.charAt(tidx);
                if(curr == ')' && top == '('){
                    if(tidx > 0){
                        currMax = i-tidx+1+dp[tidx-1];
                        ans = Math.max(currMax, ans);
                    } else {
                        currMax = i-tidx+1;
                        ans = Math.max(currMax, ans);    
                    }
                    dp[i] = currMax;
                    st.pop();
                } else{
                    st.push(i);   
                }
            } else{
                st.push(i);
            }
        }
        return ans;
    }
    
}