class Solution {
    public int minOperations(int[] nums) {
        List<Integer> st = new ArrayList<>();
        int c = 0;
        for(int ele : nums){
            while(!st.isEmpty() && st.get(st.size()-1)>ele) st.remove(st.size()-1);
            if(ele==0) continue;
            if(st.isEmpty() || st.get(st.size()-1)<ele) {
                st.add(ele);
                c++;
            }
        }
        return c;
    }
}