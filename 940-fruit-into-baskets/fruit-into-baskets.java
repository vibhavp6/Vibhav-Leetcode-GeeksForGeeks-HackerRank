class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int st =0;
        int ans =0;
        for(int i =0; i<fruits.length; i++){
            mpp.put(fruits[i], mpp.getOrDefault(fruits[i],0)+1);
            while(mpp.size()>2){
                mpp.put(fruits[st],mpp.get(fruits[st])-1);
                if(mpp.get(fruits[st])==0){
                    mpp.remove(fruits[st]);
                }
                st++;
            }
            ans = Math.max(ans, i-st+1);
        }
        return ans;
    }
}