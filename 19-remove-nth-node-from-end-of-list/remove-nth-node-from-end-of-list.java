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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int k = count - n;
        if (count == n) return head.next;
        ListNode vib = head;
        for (int i =0; i<k-1; i++ ) {
            vib = vib.next;
        }
        vib.next = vib.next.next;
        return head;
    }
}