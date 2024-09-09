import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        Stack<Integer> ss = new Stack<>();
        
        for (int i = 0; i < nums2.length; i++) {
            int num = nums2[i];
            while (!ss.isEmpty() && ss.peek() < num) {
                hs.put(ss.pop(), num);
            }
            ss.push(num);
        }
        
        while (!ss.isEmpty()) {
            hs.put(ss.pop(), -1);
        }
        
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = hs.get(nums1[i]);
        }
        
        return result;
    }
}
