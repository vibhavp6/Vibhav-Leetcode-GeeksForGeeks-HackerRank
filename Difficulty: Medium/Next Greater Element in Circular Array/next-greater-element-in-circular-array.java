class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        // code here
        int n = arr.length;
        
        int max = -1, ind = -1;
        for(int i =0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
                ind = i;
            }
        }
        
        Stack<Integer> stk = new Stack<>();
        stk.push(max);
        ArrayList<Integer> ll = new ArrayList<>(Collections.nCopies(n, -1));
        ll.set(ind, -1);
        int i = ind -1;
        while(i >= 0) {
            while(!stk.isEmpty() && stk.peek() <= arr[i]) stk.pop();
            int temp = arr[i];
            if(!stk.isEmpty()) {
                ll.set(i, stk.peek());
            }
            stk.push(arr[i]);
            i--;
        }
        
        i = n-1;
        while(i > ind) {
            while(!stk.isEmpty() && stk.peek() <= arr[i]) stk.pop();
            int temp = arr[i];
            if(!stk.isEmpty()) {
                ll.set(i, stk.peek());
            }
            stk.push(arr[i]);
            i--;
        }
        
        return ll;
    }
}