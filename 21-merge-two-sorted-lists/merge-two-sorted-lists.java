/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode pt = dummy;
        ListNode l1 = list1;
        ListNode l2 = list2;
        while (l1 != null || l2 != null) {
            if((l1!= null && l2!= null) && (l1.val <= l2.val )) {
                pt.next = l1;
                pt = pt.next;
                l1 = l1.next;
            }
            else if((l1!= null && l2!= null) && (l2.val < l1.val ) ) {
                pt.next = l2;
                pt = pt.next;
                l2 = l2.next;
            }
            else if (l1 != null) {
                pt.next = l1;
                pt = pt.next;
                l1 = l1.next;
            }
            else if (l2 != null) {
                pt.next = l2;
                pt = pt.next;
                l2 = l2.next;
            }

        }
        return dummy.next;
    }
}