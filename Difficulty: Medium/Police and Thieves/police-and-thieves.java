class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
        int ans = 0;
        int n = arr.length;
        for(int i=0; i<n; i++) {
            if(arr[i] == 'P') {
                int l = Math.max(0, i - k);
                int u = Math.min(n-1, i + k);
                for(int j=l; j<=u; j++) {
                    if(arr[j] == 'T') {
                        ans++;
                        arr[j] = 'S';
                        break;
                    }
                }
            }
        }
        
        return ans;
    }
}