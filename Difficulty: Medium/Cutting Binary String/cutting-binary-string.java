class Solution {
     boolean isPowerOf5(String str) {
     if (str.charAt(0) == '0') return false;
        int num = Integer.parseInt(str, 2);
       if (num == 0) return false;
       while (num % 5 == 0) num /= 5;
       return num == 1;
    }
    int solve(int idx,int n,String s,Map<Integer,Integer>mp)
    {
        if(idx==n)return 0;
        if(mp.containsKey(idx))return mp.get(idx);
        int minCuts = Integer.MAX_VALUE;
        
        for(int i=idx;i<n;i++)
        {
            String str=s.substring(idx,i+1);
            if(isPowerOf5(str))
            {
                int next = solve(i + 1, n, s, mp);
                if (next != -1) minCuts = Math.min(minCuts, 1 + next);
            }
        }
        mp.put(idx, minCuts == Integer.MAX_VALUE ? -1 : minCuts);
        return mp.get(idx);
    }
    public int cuts(String s) {
        // code here
        int n=s.length();
        Map<Integer,Integer>mp=new HashMap<>();
        return solve(0,n,s,mp);
    }
}

