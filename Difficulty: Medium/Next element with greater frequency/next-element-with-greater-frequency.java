import java.util.stream.*;
class Solution {
    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        // code here
        Map<Integer, Long> map = Arrays.stream(arr)
                                      .boxed()
                                      .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
              
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            res.add(-1);
            while(!st.isEmpty() && map.get(arr[st.peek()]) < map.get(arr[i])){
                res.set(st.pop(), arr[i]);
            }
            st.push(i);
        }
        return res;
    }
}