class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        List<Integer> list = new ArrayList<>();
        boolean isRev = false;
        
        while(!q.isEmpty()){
            int mid = q.size()/2;
            
            if(isRev){
                
                list.add(q.poll());
                mid--;
                
                while(mid-- > 0){
                    q.add(q.poll());
                }
                
                list.add(list.size()-1,q.poll());
            } else {
                list.add(q.poll());
                mid--;
                while(mid-- > 0){
                    q.add(q.poll());
                }
                list.add(q.poll());
            }
            
            isRev = !isRev;
        }
        for(int v : list){
            q.add(v);
        }
    }
}