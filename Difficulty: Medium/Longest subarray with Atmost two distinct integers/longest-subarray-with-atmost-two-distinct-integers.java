class Solution {
    public int totalElements(int[] arr) {
        // code here
       Map<Integer,Integer>mp = new HashMap<>();
        int ans = 0, i = 0;
        for(int j = 0;j<arr.length;j++){
            mp.put(arr[j],mp.getOrDefault(arr[j],0)+1);
            if(mp.size() <= 2) {
                ans = Math.max(ans,j-i+1);
            }
            while(i < j && mp.size() > 2){
                mp.put(arr[i],mp.get(arr[i])-1);
                mp.remove(arr[i],0);
                i++;
                if(mp.size() <= 2) ans = Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}