class Solution {
    public int startStation(int[] gas, int[] cost) {
        int totalg = 0;
        int totalc = 0;
        for(int i=0;i<gas.length;i++) {
            totalg += gas[i];
            totalc += cost[i];
        }
        if(totalg<totalc){
            return -1;
        }
        int cg = 0;
        int ans = 0;
        for(int i=0;i<gas.length;i++) {
            cg += gas[i]-cost[i];
            if(cg<0) {
                cg = 0;
                ans = i+1;
            }
        }
        return ans;
    }
}