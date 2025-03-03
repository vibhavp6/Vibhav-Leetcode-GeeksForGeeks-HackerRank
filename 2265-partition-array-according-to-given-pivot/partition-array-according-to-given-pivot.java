class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        List<Integer> list=new ArrayList();
        int idx=0;
        int pivCnt=0;

        // Traverse the array to count pivot elements and segregate elements
        for(int i=0; i<n; i++){
            if(nums[i]==pivot){
                pivCnt++;
            }
            else if(nums[i]>pivot){
                list.add(nums[i]);                
            }
            else{
                nums[idx++]=nums[i];
            }
        }

        // Insert pivot elements
        for(int i=0; i<pivCnt; i++){
            nums[idx++]=pivot;
        }

        // Append greater elements
        for(int val:list){
            nums[idx++]=val;
        }
        
        return nums;
    }
}