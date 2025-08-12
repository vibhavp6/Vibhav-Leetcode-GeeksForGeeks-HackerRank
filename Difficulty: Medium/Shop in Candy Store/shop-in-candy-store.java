class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        Arrays.sort(prices);
        int n=prices.length;
        int i=0,j=n-1;
        
        int minCost=0;
        while(i<=j){
            minCost+=prices[i++];
            j-=k;
        }
        
        i=0; j=n-1;
        int maxCost=0;
        while(i<=j){
            maxCost+=prices[j--];
            i+=k;
        }
        
        return new ArrayList<>(Arrays.asList(minCost,maxCost));
    }
}