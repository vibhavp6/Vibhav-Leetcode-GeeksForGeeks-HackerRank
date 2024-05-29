//{ Driver Code Starts
import java.io.*;
import java.util.*;

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

            Solution obj = new Solution();
            int res = obj.findWinner(n, x, y);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int findWinner(int n, int x, int y) {
        boolean dp[] = new boolean[n+1];
        dp[1] = true;
        if(n>=x){
            dp[x]=true;
        }
        if(n>=y){
            dp[y]=true;
        }
        for(int i=2;i<dp.length;i++){
            if(dp[i-1]==false){
                dp[i]=true;
            }
            else if(i-x>=0 && dp[i-x]==false){
                dp[i]=true;
            }
            else if(i-y>=0 && dp[i-y]==false){
                dp[i]=true;
            }
            else{
                dp[i]=false;
            }
        }
         return dp[n]==true?1:0;
    }
}
