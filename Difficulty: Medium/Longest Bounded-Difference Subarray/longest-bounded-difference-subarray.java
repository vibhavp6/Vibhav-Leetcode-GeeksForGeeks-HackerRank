class Solution {
    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        ArrayDeque<Integer> max = new ArrayDeque<>();
        ArrayDeque<Integer> min = new ArrayDeque<>();
        int initial = 0, finall = 0;
        int len = 0;
        int i = 0, j = 0;
        int n = arr.length;
        while(j < n){
            while(!max.isEmpty() && arr[max.peekLast()] < arr[j]){
                max.pollLast();
            }
            while(!min.isEmpty() && arr[min.peekLast()] > arr[j]){
                min.pollLast();
            }
            
            max.offerLast(j);
            min.offerLast(j);
            
            int tempLen = j - i + 1;
            if(tempLen > 1)
            while(!max.isEmpty() && !min.isEmpty() && Math.abs(arr[max.peekFirst()] - arr[min.peekFirst()]) > x){
                if(i == max.peekFirst())
                max.pollFirst();
                if(i == min.peekFirst())
                min.pollFirst();
                
                i++;
            }
            tempLen = j - i + 1;
            if(tempLen > 1 && tempLen > len){
                len = tempLen;
                initial = i;
                finall = j;
            }
            
            j++;
        }
        
        for(i = initial;i<=finall;i++){
            res.add(arr[i]);
        }
        
        return res;
    }
}