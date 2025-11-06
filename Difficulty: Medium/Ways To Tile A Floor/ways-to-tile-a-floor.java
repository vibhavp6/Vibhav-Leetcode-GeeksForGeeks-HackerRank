class Solution {
    public int numberOfWays(int n) {
        // code here
        Map<Integer,Integer> hm = new HashMap<>();
        
        return find(hm,n);
    }
    private int find(Map<Integer,Integer> hm, int n){
        if(n == 0) return 1;
        if(n < 0) return 0;
        if(hm.containsKey(n)) return hm.get(n);
        
        int ans = find(hm,n-1) + find(hm,n-2);
        hm.put(n,ans);
        
        return ans;
    }
};