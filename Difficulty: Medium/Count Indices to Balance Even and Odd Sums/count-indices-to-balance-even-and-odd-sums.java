class Solution {
    public int cntWays(int[] arr) {
        // code here
        int n = arr.length;
        int evenSum = 0, oddSum = 0;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }
        
        int cnt = 0;
        int tEven = 0, tOdd = 0;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                tEven += arr[i];
                int remainingOdd = oddSum - tOdd;
                int remainingEven = evenSum - tEven;
                
                if (remainingOdd + (tEven - arr[i]) == tOdd + remainingEven) {
                    cnt++;
                }
            } else {
                tOdd += arr[i];
                int remainingOdd = oddSum - tOdd;
                int remainingEven = evenSum - tEven;
                
                if (remainingOdd + tEven == (tOdd - arr[i]) + remainingEven) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}