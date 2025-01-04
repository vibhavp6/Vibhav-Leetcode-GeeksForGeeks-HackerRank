class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0 ;
        for (int i=0; i<accounts.length; i++){
            int sum = 0;
            for(int j : accounts[i]){
                sum += j;
            }
            max = (max<sum)?sum:max;
        }
        return max;
    }
}