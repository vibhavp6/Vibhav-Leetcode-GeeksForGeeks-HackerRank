class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int  i =0; i<n; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i]; 
            } else {
                continue;
            }
        }
        while (j< n) {
            arr[j++] =0;
        }
    }
}