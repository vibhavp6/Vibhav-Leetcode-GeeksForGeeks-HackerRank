class Solution {
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(b);
        
        for (int i = 0; i < a.length; i++) {
            int cnt = binarySearch(b, a[i]);
            while (cnt < b.length && b[cnt] == a[i]) cnt++;
            ans.add(cnt);
        }
        
        return ans;
    }
    
    private static int binarySearch(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == k) return mid;
            else if (arr[mid] > k) high = mid - 1;
            else low = mid + 1;
        }
        
        return low;
    }
}