class Solution {
    public ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {
        Arrays.sort(a);
        Arrays.sort(b);

        int m = a.length;
        int n = b.length;

        ArrayList<Integer> res = new ArrayList<>();

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (x, y) -> y[0] - x[0]);
        Set<String> visited = new HashSet<>();

        maxHeap.add(new int[]{a[m - 1] + b[n - 1], m - 1,
        n - 1});
        visited.add((m - 1) + "#" + (n - 1));

        while (k-- > 0 && !maxHeap.isEmpty()) {
            int[] top = maxHeap.poll();
            res.add(top[0]);
            int i = top[1], j = top[2];

            if (i - 1 >= 0 && 
            !visited.contains((i - 1) + "#" + j)) {
                maxHeap.add(new int[]{a[i - 1] + b[j], i - 1, j});
                visited.add((i - 1) + "#" + j);
            }
            if (j - 1 >= 0 && 
            !visited.contains(i + "#" + (j - 1))) {
                maxHeap.add(new int[]{a[i] + b[j - 1], i, j - 1});
                visited.add(i + "#" + (j - 1));
            }
        }

        return res;
    }
}