class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long sumTotal=0;
        long sumCurr=0;
        int cnt=0;

        // Calculate total sum
        for(int i=0; i<n; i++){
            sumTotal+=nums[i];
        }

        // Check valid splits condition
        for(int i=0; i<n-1; i++){
            sumCurr+=nums[i];
            if(sumCurr >= sumTotal-sumCurr){
                cnt++;
            }
        }

        return cnt;
    }
}