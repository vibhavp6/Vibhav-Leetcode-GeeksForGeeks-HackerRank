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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k ==0) return head;
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println(count);
        k = k%count;
        if (k==0) return head;
        int n = count - k;
        ListNode vib = head;
        for (int i = 0; i<n-1; i++) {
            vib = vib.next;
        }
        ListNode safe = vib.next;
        vib.next =null;
        temp = safe;
        while (temp.next!= null) {
            temp = temp.next;
        }
        temp.next = head;
        return safe;
    }
}