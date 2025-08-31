class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int n = arr.length;
        int l = 0, r = n-1,res = 0;
        while(l<r){
            int a = arr[l];
            int b = arr[r];
            res = Math.max(res,(r-l) * Math.min(a,b));
            if(a<b)l++;
            else r--;
        }
        return res;
    }
}