/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet <ListNode> ans = new HashSet<>();
        ListNode temp = headA;
        while (temp!= null) {
            ans.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null) {
            if (ans.contains(temp)) {
                return temp;
            } else {
                temp = temp.next;
            }
        }
        return null;
    }
}