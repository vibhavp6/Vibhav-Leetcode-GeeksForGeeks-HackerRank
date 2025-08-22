class Solution {
    public int median(int[][] mat) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int[] i : mat) for(int j : i) pq.offer(j);
        int n=pq.size()/2;
        while(n>0){
            pq.poll();n--;
        }
        return pq.poll();
    }
}