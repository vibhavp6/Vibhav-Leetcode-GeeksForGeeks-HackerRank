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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd  = new ListNode(-1);
        ListNode even  = new ListNode(-1);
        ListNode e  = even;
        ListNode o = odd;
        ListNode temp = head;
        int index = 1;
        while (temp != null) {
            if (index%2 == 0) {
                e.next = temp;
                e = e.next;
            }
             if (index%2 == 1) {
                o.next = temp;
                o = o.next;
            }
            temp = temp.next;
            index++;
        }
        o.next = even.next;
        e.next = null;
        return odd.next;
    }
}