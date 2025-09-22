class Solution {
    public ArrayList<Integer> maxOfMins(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n, 0));
        Stack<Integer> s = new Stack<>();

        // Array to store the length of the window 
        // where each element is the minimum
        ArrayList<Integer> lenArr = new ArrayList<>(Collections.nCopies(n, 0));

        // Traverse through array to determine 
        // window sizes using a stack
        for (int i = 0; i < n; i++) {
            // Process elements to find next smaller 
            // element on the left
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                int top = s.pop();
                int windowSize = s.isEmpty() ? i : i - s.peek() - 1;
                lenArr.set(top, windowSize);
            }
            s.push(i);
        }

        // Process remaining elements in the stack
        // for right boundaries
        while (!s.isEmpty()) {
            int top = s.pop();
            int windowSize = s.isEmpty() ? n : n - s.peek() - 1;
            lenArr.set(top, windowSize);
        }

        // Fill ressult based on lenArr[] and arr[]
        for (int i = 0; i < n; i++) {
            int windowSize = lenArr.get(i) - 1;  // 0-based indexing
            res.set(windowSize, Math.max(res.get(windowSize), arr[i]));
        }

        // Fill remaining entries in res[] to ensure 
        // all are max of min
        for (int i = n - 2; i >= 0; i--)
            res.set(i, Math.max(res.get(i), res.get(i + 1)));

        return res;
    }
}