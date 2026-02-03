class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        // Multiple Transactions Allowed
        // 
        // int profit = 0;
        // for(int i = 1;i < prices.length;i++){
        //     if(prices[i - 1] < prices[i])
        //         profit += (prices[i] - prices[i - 1]);
        // }
        // return profit;
        
        
        //At most one transaction allowed
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices){
            if (price < minPrice)
                minPrice = price; // best buy so far
            else
                maxProfit = Math.max(maxProfit, price - minPrice); 
                // best sell so far
        }
        return maxProfit;
    }
}