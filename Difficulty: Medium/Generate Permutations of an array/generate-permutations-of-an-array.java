class Solution {
    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        solve(0, arr, result);
  
        
        return result;
    }

    private static void solve(int index, int[] arr, ArrayList<ArrayList<Integer>> result) {
        // Base Case: If index reaches the end, add the current permutation
        if (index == arr.length) {
            ArrayList<Integer> currentPermutation = new ArrayList<>();
            for (int num : arr) {
                currentPermutation.add(num);
            }
            result.add(currentPermutation);
            return;
        }

        // Iterate through remaining elements to place at the current 'index'
        for (int i = index; i < arr.length; i++) {
            // 1. Swap current index with i
            swap(arr, index, i);
            
            // 2. Recurse for the next position
            solve(index + 1, arr, result);
            
            // 3. Backtrack: Swap back to restore original array
            swap(arr, index, i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}