class Solution {
    public ArrayList<Integer> findGreater(int[] arr) {
        int n = arr.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        ArrayList<Integer> ll = new ArrayList<>(Collections.nCopies(n, -1));
        
        Stack<Integer> stk = new Stack<>();
        for(int i =n-1; i >= 0; i--) {
            while(!stk.isEmpty() && map.get(stk.peek()) <= map.get(arr[i])) {
                stk.pop();
            }
            if(stk.isEmpty()) {
                ll.set(i, -1);
            } else {
                ll.set(i, stk.peek());
            }
            stk.push(arr[i]);
        }
        return ll;
        
    }
}

