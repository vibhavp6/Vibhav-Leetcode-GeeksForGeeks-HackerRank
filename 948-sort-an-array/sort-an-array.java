class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    
    private void mergeSort(int[] arr, int start, int end) {
        if (start >= end) return;
        
        int mid = start + (end - start) / 2;
        
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        
        merge(arr, start, mid, end);
    }
    
    private void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        
        while (j <= end) {
            temp[k++] = arr[j++];
        }
        
        for (int l = 0,  n = start; l < temp.length; l++, n++) {
            arr[n] = temp[l];
        }
    }
}
