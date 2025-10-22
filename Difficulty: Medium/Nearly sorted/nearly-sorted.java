class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // MIN HEAP
        
        for(int i = 0 ; i < arr.length ; i++){
            pq.add(arr[i]);
        }
        
        int i = 0;
        
        while(!pq.isEmpty()){
            arr[i] = pq.remove();
            i++;
        }
    }
}
