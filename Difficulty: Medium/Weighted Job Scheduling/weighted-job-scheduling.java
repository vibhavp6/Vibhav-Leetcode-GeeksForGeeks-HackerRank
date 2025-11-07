class Solution {
    public int maxProfit(int[][] jobs) {
        // code here
        Arrays.sort(jobs, (j1,j2) -> j1[1]-j2[1]);
        int n = jobs.length;
        int dp[] = new int[n];
        
        int ans = 0;
        
        for(int i=0;i<n;i++){
            int s = 0 , e = i;
            while(s<=e){
                int m = (s+e)/2;
                if(jobs[m][1]<=jobs[i][0]){
                    s = m+1;
                }
                else{
                    e = m -1;
                }
            }
            int cur = jobs[i][2];
            if(e!=-1) cur += dp[e];
            
            if(ans<cur) ans = cur;
            dp[i] = ans;
            
        }
        return ans;
    }
}

