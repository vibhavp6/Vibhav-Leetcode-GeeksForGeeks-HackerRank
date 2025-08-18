class Solution {
    public int hIndex(int[] citations) {
        // code here
        
         Arrays.sort(citations);
         int hIndex=0;
        
        for(int i=0;i<citations.length;i++){
           if(citations.length-i<=citations[i]){
            hIndex=Math.max(hIndex,citations.length-i);
        }
        }
        
        return hIndex;
    }
}