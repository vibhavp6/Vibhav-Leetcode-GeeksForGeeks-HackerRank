class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        // Code here
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
             if(a[1] == b[1]) { // same freq 
                return Integer.compare(b[0], a[0]); // prefer larger element
             } 
             else {
                 return Integer.compare(b[1], a[1]);
             }
        });
        
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int next : arr) {
            map.put(next, map.getOrDefault(next, 0) + 1);
        }
        
        for(int key : map.keySet()) {
            int val = map.get(key);
            pq.offer(new int[]{key, val});
        }
        
        while(k-- > 0) {
            ans.add(pq.poll()[0]);
        }
    
        
        return ans;
    }
}
