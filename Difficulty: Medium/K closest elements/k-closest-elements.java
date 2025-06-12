class Solution {
    int[] printKClosest(int[] arr, int k, int x) {
        // code here
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0])
                return b[1] - a[1];
            return a[0] - b[0];
        });
        
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(arr[i] - x);
            if (diff == 0)
                continue;
            pq.offer(new int[] {diff, arr[i]});
        }
        
        int[] ans = new int[k];
        int idx = 0;
        while (k-- > 0 && !pq.isEmpty()) {
            int val = pq.peek()[1];
            pq.poll();
            ans[idx++] = val;
        }
        return ans;
    }
}