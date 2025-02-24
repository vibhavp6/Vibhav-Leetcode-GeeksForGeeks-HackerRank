/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet <ListNode> ans = new HashSet<>();
        ListNode temp = head;
        while (temp != null) {
            if (ans.contains(temp)) {
                return true;
            }
            ans.add(temp);
            temp = temp.next;
        }
        return false;
    }
}