class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int ans = 0;  
        int zero = 0; 
        int left = 0; 

        // Iterate through the array with the right pointer
        for (int right = 0; right < arr.length; right++) {
            // If we encounter a zero, increment zero
            if (arr[right] == 0) {
                zero++;
            }

            while (zero> k) {
                if (arr[left] == 0) {
                    zero--;
                }
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
        
    }
}