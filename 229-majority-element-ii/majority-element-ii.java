class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n= nums.length;
        
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(n==1){
            ans.add(nums[0]);
            return ans;
        }
        else if(n==2){
            ans.add(nums[0]);
            if(nums[0]!=nums[1])ans.add(nums[1]);
            return ans;
        }
        for(int i=0;i<n-n/3;i++){
            if(nums[i]==nums[i+n/3]){
                
                ans.add(nums[i]);
                i=i+n/3;
            }
            int a = ans.size();
            if (a > 1 && ans.get(ans.size() - 1).equals(ans.get(ans.size() - 2))) {
            ans.remove(ans.size() - 1);
            }
        }
        
        return ans;
    }
}