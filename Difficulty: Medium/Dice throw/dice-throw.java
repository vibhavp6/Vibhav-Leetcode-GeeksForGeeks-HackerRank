class Solution {
    
    static int helper(int n,int m,int x,int[][] memo) {
        if(n == 0 && x == 0) return 1;
        if(x < 0 || n == 0) return 0;
        
        if(memo[n][x] != -1)
            return memo[n][x];
        
        int count = 0;
        for(int i = 1; i <= m; ++i) 
            count += helper(n-1,m,x-i,memo);
        
        return memo[n][x] = count;
    }
    
    static int noOfWays(int m, int n, int x) {
        int[][] memo = new int[n + 1][x + 1];
        
        for(int[] mem : memo)
            Arrays.fill(mem,-1);
            
        return helper(n,m,x,memo);
    }
}
 

 

