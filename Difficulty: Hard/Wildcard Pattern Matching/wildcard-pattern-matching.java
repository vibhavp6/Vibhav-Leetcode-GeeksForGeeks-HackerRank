//{ Driver Code Starts
import java.util.*;

class WildcardPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String pat = sc.nextLine();
            String text = sc.nextLine();
            Solution g = new Solution();
            System.out.println(g.wildCard(pat, text));
            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    public boolean rec(String p,String s,int i,int j,Boolean dp[][]){
        if(dp[i][j]!=null) return dp[i][j];
        boolean m=false;
        if(i==p.length() && j==s.length()) m=true;
        else if(i==p.length()) m=false;
        else if(j==s.length()) m=p.charAt(i)=='*' && rec(p,s,i+1,j,dp);
        else if(s.charAt(j)==p.charAt(i) || p.charAt(i)=='?') m=rec(p,s,i+1,j+1,dp);
        else if(p.charAt(i)=='*') m=rec(p,s,i+1,j,dp) || rec(p,s,i,j+1,dp);
        return dp[i][j]=m;
    }
    public int wildCard(String pattern, String str) {
        // Your code goes here
        int pl=pattern.length(),sl=str.length();
        Boolean dp[][]=new Boolean[pl+1][sl+1]; //all values are null
        return rec(pattern,str,0,0,dp)?1:0;
    }
}
