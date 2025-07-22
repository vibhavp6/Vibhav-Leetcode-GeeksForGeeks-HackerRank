class Solution {
    public int missingNumber(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        int ans = 1;
        while(!set.add(ans)){
            ans++;
        }
        return ans;
    }
}