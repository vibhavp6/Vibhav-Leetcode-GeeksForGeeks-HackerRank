class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] arr=new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]]==true) {
                return nums[i];
            }
            else{
                arr[nums[i]]=true;
            }
            
        }
        return -1;
    }
}