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

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode  prev = null;
        ListNode fd = curr.next;
        while(curr != null && fd != null) {
            ListNode fdd= fd.next;
            if(head == curr) {
                head = fd;
            } else{
                prev.next = fd;
            }
            curr.next = fdd;
            fd.next = curr;
            prev = curr;
            curr = fdd;
            if(curr!= null) {
                fd= curr.next;
            }
        }
        return head;
    }
}