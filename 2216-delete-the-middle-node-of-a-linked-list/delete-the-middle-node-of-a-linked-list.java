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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;

        ListNode temp = head;
        int count = 0;
        while(temp!= null) {
            count++;
            temp = temp.next;
        }
        ListNode t = head;

        for (int i = 0; i<(count/2) - 1; i++){
            t =t.next;
        }

        t.next = t.next.next;
        return head;
    }
}