class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int n = arr.length, m = arr[0].length;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (arr[i][j] == 1) return i;
            }
        }
        return -1;
    }
}