class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        // code here
        Queue<Integer> pq=new PriorityQueue<>();
        for(int[] row:matrix) for(int i:row) pq.add(i);
        while(k-->1) pq.poll();
        return pq.peek();
    }
}