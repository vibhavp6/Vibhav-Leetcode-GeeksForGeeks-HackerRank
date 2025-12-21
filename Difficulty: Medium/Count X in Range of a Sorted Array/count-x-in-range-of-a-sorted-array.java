class Solution {
    public ArrayList<Integer> countXInRange(int[] arr, int[][] queries) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int[] q : queries) {
            int l = q[0], r = q[1], x = q[2];

            int first = firstOccurrence(arr, l, r, x);
            if (first == -1) {
                ans.add(0);
                continue;
            }

            int last = lastOccurrence(arr, l, r, x);
            ans.add(last - first + 1);
        }

        return ans;
    }

    // Find first occurrence of x within [l, r]
    private int firstOccurrence(int[] arr, int l, int r, int x) {
        int res = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                res = mid;
                r = mid - 1;
            } else if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }

    // Find last occurrence of x within [l, r]
    private int lastOccurrence(int[] arr, int l, int r, int x) {
        int res = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                res = mid;
                l = mid + 1;
            } else if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }
}

