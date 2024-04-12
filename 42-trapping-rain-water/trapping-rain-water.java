class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int leftMax = 0;
        int rightMax = 0;
        int res = 0;

        while(l < r){
            if(height[l] <= height[r]){

                if(height[l] >= leftMax){
                    leftMax = height[l];
                }else{
                    res += leftMax - height[l];
                }
                l++;
            }else {
                
                if(height[r] >= rightMax){
                    rightMax = height[r];
                }else{
                    res += rightMax - height[r];
                }
                r--;                
            }
        }
        return res;
    }
}