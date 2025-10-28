class Solution {
    public int countValidSelections(int[] nums) {
        int ans =0;
        int totalsum =0;
        for (int i =0; i<nums.length;i++){
            totalsum += nums[i];
        }
        int currsum= 0;
        for(int i =0;i<nums.length; i++){
            currsum = currsum + nums[i];
            totalsum = totalsum-nums[i];
            int vib = Math.abs(totalsum-currsum);
            if(vib==1 && nums[i] ==0){
                ans +=1;
            } else if(vib ==0 && nums[i]==0){
                ans +=2;
            }
        }
        return ans;
    }
}