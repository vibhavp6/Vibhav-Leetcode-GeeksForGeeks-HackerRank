class Solution {
    public int solve(int cutsModified[],int length,int start, int end,int dp[][]){
        // int len=cuts.length;

        int min=Integer.MAX_VALUE;
        if(dp[start][end]!=-1)
        return dp[start][end];
        for(int i=start;i<=end;i++){
            min=Math.min(min,cutsModified[end+1]-cutsModified[start-1]+solve(cutsModified,length,start,i-1,dp)+solve(cutsModified,length,i+1,end,dp));
        }
        return dp[start][end]=min==Integer.MAX_VALUE?0:min;
        
    }
    public int minCutCost(int n, int[] cuts) {
        // code here
        int len=cuts.length;
        int cutsModified[]=new int[len+2];
                
        for(int i=0;i<len;i++){
            cutsModified[i+1]=cuts[i];
        }
        int dp[][]=new int[len+2][len+2];
        for(int i=0;i<len+2;i++)
        Arrays.fill(dp[i],-1);
        cutsModified[len+1]=n;
        Arrays.sort(cutsModified);
        return solve(cutsModified,len,1,len,dp);
        
    }
}

