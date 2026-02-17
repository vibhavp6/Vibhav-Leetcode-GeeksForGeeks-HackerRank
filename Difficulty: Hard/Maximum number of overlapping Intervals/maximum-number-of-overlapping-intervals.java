class Solution {
    public static int overlapInt(int[][] arr) {
        int [] start = new int[arr.length];
        int [] end = new int[arr.length];
        
        for (int i = 0; i<arr.length; i++){
            start[i] = arr[i][0];
            end[i] = arr[i][1];
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        
        int i = 0; 
        int j = 0;
        int overlap = 0;
        int maxOverlap = 0;
        while (i < start.length && j < end.length){
            if(start[i] <= end[j]){
                overlap++;
                maxOverlap = Math.max(overlap,maxOverlap);
                i++;
            }else{
                overlap--;
                j++;
            }
        }
        return maxOverlap;
    }
}
