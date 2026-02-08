class Solution {
    int maxProduct(int[] arr) {
        // code here
        int maximumProduct = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        int n = arr.length;
        
        for(int i = 0 ; i < n ; i++){
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;
            
            prefix = prefix * arr[i];
            suffix = suffix * arr[n - i - 1];
            
            maximumProduct = Math.max(maximumProduct , Math.max(prefix , suffix));
        }
        return maximumProduct;
    }
}