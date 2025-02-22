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
    public ListNode middleNode(ListNode head) {
        if(head == null) return null;
        ListNode temp = head;
        int count = 0;
        
        while (temp != null) {
            count ++;
            temp = temp.next;
        }
        ListNode vv = head;

        for (int i = 1; i <=(count/2); i++) {
            vv = vv.next;
        }

        return vv;
    }
}