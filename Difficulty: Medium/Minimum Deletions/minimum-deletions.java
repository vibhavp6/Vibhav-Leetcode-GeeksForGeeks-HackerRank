class Solution {
    
   static  int find(int i, int j,String a, String s, int dp[][]){
        if(i<0 || j<0 || i>=a.length() || j>=s.length() ) return 0;        
        
        
        if(dp[i][j]!=-1)return dp[i][j];
        if(a.charAt(i)==s.charAt(j)){
            return dp[i][j]=1+find(i-1, j-1,a,s,dp);
        }else {
            return dp[i][j]=Math.max(find(i-1, j, a,s,dp),find(i, j-1, a,s,dp)) ;
        }
    }
    
    
    static int minDeletions(String s) {
        StringBuilder str=new StringBuilder(s);
        String a=str.reverse().toString();
        int dp[][]=new int[a.length()][a.length()];
        for(int v[]:dp )Arrays.fill(v,-1);
        return s.length()-find(s.length()-1, s.length()-1, s, a,dp);
        
    }
}