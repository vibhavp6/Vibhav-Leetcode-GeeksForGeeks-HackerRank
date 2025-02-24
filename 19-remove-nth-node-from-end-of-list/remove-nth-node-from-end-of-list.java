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
        ListNode temp = head;
        int count = 0;
        while (temp!= null) {
            count ++;
            temp = temp.next;
        }
        ListNode vib = head;
        if (count == n) return head.next;
        int k = count - n;
        for (int i =0; i< k-1; i++) {
            vib = vib.next;
        }
        vib.next = vib.next.next;
        return head;
    }
}