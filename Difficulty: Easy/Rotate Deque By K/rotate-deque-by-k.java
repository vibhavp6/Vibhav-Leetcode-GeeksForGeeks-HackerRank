class Solution {
    public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        // code here
        int n = dq.size();
        k %= n;
        
        if (type == 1) {
            while (k-- != 0) {
                int ele = dq.pollLast();
                dq.offerFirst(ele);
            }
            
        }
        else if (type == 2) {
            while (k-- != 0) {
                int ele = dq.pollFirst();
                dq.offerLast(ele);
            }
            
        }
         return ;
    }
}