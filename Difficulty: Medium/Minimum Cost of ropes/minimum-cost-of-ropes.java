class Solution {
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int i:arr){
            minheap.add(i);
        }
        int cost = 0;
        while(minheap.size()>1){
            int rope1 = minheap.poll();
            int rope2 = minheap.poll();
            cost += (rope1 + rope2);
            minheap.add(rope1 + rope2);
        }
        return cost;
    }
}
