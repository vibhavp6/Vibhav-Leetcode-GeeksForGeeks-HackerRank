class Solution {
    public int maxProfit(int[] arr) {
        // int mx = 0;
        // int temp =0;
        // for (int i=0; i<prices.length; i++) {
        //     temp = prices[i];
        //     for (int j = i+1; j <prices.length; j++) {
        //         if (temp < prices [j]) {
        //             int diff = prices[j] - temp;
        //             mx = Math.max(mx, diff);
        //         }
        //     }
        // }
        // return mx;

        // optimal 

        int maxPro = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        minPrice = Math.min(minPrice, arr[i]);
        maxPro = Math.max(maxPro, arr[i] - minPrice);
    }
    return maxPro;
    }
}