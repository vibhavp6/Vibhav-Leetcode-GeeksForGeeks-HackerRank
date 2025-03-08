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
        if(head == null || head.next == null || k == 0) return head;
        int cnt = 1; 
        ListNode temp = head;
        while(temp.next!= null) {
            cnt++;
            temp = temp.next;
        }

        temp.next = head;
        k = k%cnt;
    
        temp = head;
        for (int i = 0;i < cnt-k-1; i++){
            temp = temp.next;
        }
        ListNode newhead = temp.next;
        temp.next = null;
        return newhead;
    }
}