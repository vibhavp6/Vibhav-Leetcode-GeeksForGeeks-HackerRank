class Solution {
    public int longestOnes(int[] nums, int k) {
        int cnt = 0;
        int st = 0;
        int ans =0;
        for(int i =0; i<nums.length;i++){
            if(nums[i] ==0){
                cnt++;
            }
            while(cnt>k){
                if(nums[st] == 0) cnt--;
                st++;
            }
            ans = Math.max(ans,i-st+1);
        }
        return ans;
    }
}