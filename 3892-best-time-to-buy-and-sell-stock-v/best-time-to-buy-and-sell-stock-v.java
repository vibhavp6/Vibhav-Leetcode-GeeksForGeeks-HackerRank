class Data{
    long profit=0, buy=0, sell=0;
    Data(long profit, long buy, long sell){
        this.profit=profit;
        this.buy=buy;
        this.sell=sell;
    }
}
class Solution {
    static public long maximumProfit(int[] prices, int k) {
        final int x0=prices[0], n=prices.length;
        Data [] dp=new Data[k+1];
        for (int t=0; t<=k; t++)
            dp[t]=new Data(0, -x0, x0);
        for(int i=1; i<n; i++){
            final int x=prices[i];
            for(int t=k; t>0; t--){
                Data cur=dp[t];
                long prevP=dp[t-1].profit;
                cur.profit=Math.max(cur.profit, Math.max(cur.buy+x, cur.sell-x));
                cur.buy=Math.max(cur.buy,  prevP-x);
                cur.sell=Math.max(cur.sell, prevP+x);
            }
        }
        return dp[k].profit;
    }
}