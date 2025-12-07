class Solution {
    
    private int mod = 1000000007;
    int distinctSubseq(String str) {
        // code here
        int n = str.length();
        long[] dp = new long[n+1];
        int[] last = new int[26];
        Arrays.fill(last, -1);
        dp[0] = 1; // Empty Subsequence
        
        for(int i=1;i<=n;i++) {
            int x = str.charAt(i-1)-'a';
            dp[i] = (2*dp[i-1]) % mod; // 2*dp[i-1] because we have two options pick and unpick
            
            /*
                eg : gfg
                if we are at f availabale subsequences are "", "g"
                if we combine f we will "f", "gf", "", "g"
                because for every availabale subsequence we have pick and unpick so we multiply with 2
            */
            
            if(last[x] != -1) {
                dp[i] = (dp[i] - dp[last[x]-1] + mod) % mod;
            }
            
            /*
               eg : gfg
               if we are at g then g is already repeted so we may count duplicates
               availabale subsequeneces "", "g", "f", "gf"
               if we combine new g we will get
               "", "g", 'f', "gf", "g", "gg", "fg", "gfg"
               here we can observe g is repeting 
               so if we find any repeting sequenece we substract the subsequences we have seen before 
               the duplicate entry which will remove all duplicate counts in our answer
            */
            
            last[x] = i;
        }
        
        return (int)dp[n];
    }
}