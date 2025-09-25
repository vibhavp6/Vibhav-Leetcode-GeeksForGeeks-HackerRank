class Solution {
    public int minJumps(int[] arr) {
        // code here
        int n = arr.length;
        if (n == 0 || arr[0] == 0) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        int step = 0, position = 0, maxReach = 0, indexForMaxReach = -1, range;
        while (position<n) {
            maxReach = 0;
            range = arr[position];
            if ((position+range)>=(n-1)) {
                step++;
                break;
            }
            for (int i=1; i<=arr[position]; i++) {
                if ((position+i)<n && maxReach<(position+i+arr[position+i])) {
                    maxReach= position+i+arr[position+i];
                    indexForMaxReach = position+i;
                }
            }
            step++;
            position=indexForMaxReach;
            if ((position+1)>=n) {
                break;
            }
            if (maxReach == 0) {
                step = -1;
                break;
            }
            //System.out.println("Step=" + step + " Position=" + position);
        }
        return step;
    }
}