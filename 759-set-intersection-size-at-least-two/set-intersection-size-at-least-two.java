class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int prev1 = intervals[0][1] - 1;
        int prev2 = intervals[0][1];
        int count = 2;
        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end   = intervals[i][1];
            if (prev2 < start) {
                prev1 = end - 1;
                prev2 = end;
                count += 2;
            }
            else if (prev1 < start) {
                if (end == prev2) {
                    prev1 = end - 1;
                } else {
                    prev1 = end;
                }
                if (prev1 > prev2) {
                    int temp = prev1;
                    prev1 = prev2;
                    prev2 = temp;
                }
                count += 1;
            }
        }
        return count;
    }
}