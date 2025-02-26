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
    public ListNode reverse (ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr!= null) {
            ListNode nextnode = curr.next;
            curr.next =prev;
            prev = curr;
            curr = nextnode;
        }
        return prev;
     }
    public ListNode doubleIt(ListNode head) {
        ListNode ans =  new ListNode(-1);
        ListNode var = ans;
        ListNode tempa = reverse (head);

        int carry = 0;

        while (tempa!= null ||  carry != 0) {
            int sum = carry;
            if (tempa!= null) {
                sum += (tempa.val)*2;
                tempa =tempa.next;
            }
            carry = sum/10;
            var.next = new ListNode(sum%10);
            var = var.next;
        }
        return reverse(ans.next);

    }
}