class Solution {
    public int getCount(int n) {
        // code here
        int dialPad[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};
        int ans=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                ans+=rec(i,j,dialPad,n,new HashMap<>());
            }
        }
        return ans;
    }
    private int rec(int i,int j,int dial[][],int n,Map<String,Integer> hm){
        if(i<0 || j<0 || i==4 || j==3 || dial[i][j]==-1) return 0;
        String key=i+" "+j+" "+n;
        if(hm.containsKey(key)) return hm.get(key);
        int curr=0;
        if(n==1) return 1;
        curr+=rec(i,j,dial,n-1,hm);
        curr+=rec(i-1,j,dial,n-1,hm);
        curr+=rec(i+1,j,dial,n-1,hm);
        curr+=rec(i,j+1,dial,n-1,hm);
        curr+=rec(i,j-1,dial,n-1,hm);
        hm.put(key,curr);
        return curr;
    }
}