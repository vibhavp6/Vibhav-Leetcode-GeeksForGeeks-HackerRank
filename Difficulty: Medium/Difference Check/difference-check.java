class Solution {
    public int minDifference(String[] arr) {
        // code here
        int [] timeInSeconds = new int[arr.length];
        for(int i = 0;i<arr.length;i++)
        {
            String[] parts = arr[i].split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            int seconds = Integer.parseInt(parts[2]);
            timeInSeconds[i] = hours * 3600 + minutes * 60 + seconds;
        }
        Arrays.sort(timeInSeconds);
        int minDiff = Integer.MAX_VALUE;
        int n = timeInSeconds.length;
        
        for(int i = 0; i<n-1; i++){
            int diff = timeInSeconds[i+1]-timeInSeconds[i];
            minDiff = Math.min(minDiff,diff);
        }
        int lastToFirst = (86400 - timeInSeconds[n - 1])+timeInSeconds[0];
        minDiff = Math.min(minDiff,lastToFirst);
        return minDiff;
        
    }
}