class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        if(k>arr.length || k==0) return 0;
        int i =0;
        int j =0;
        int xor = 0;
        int max =0;
        while(j<arr.length){
            xor^=arr[j];
            if(j-i+1 >k){
                xor^=arr[i++];
            }
            if(j-i+1==k){
                max = Math.max(max,xor);
            }
            j++;
        }
        return max;
    }
}
