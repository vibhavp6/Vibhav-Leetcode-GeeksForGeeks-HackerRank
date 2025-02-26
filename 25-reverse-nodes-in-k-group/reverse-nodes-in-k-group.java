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
    public ListNode reverseLinkedList(ListNode head) {
        ListNode b = head;
        ListNode prev = null;

        while (b != null) {
            ListNode front = b.next;
            b.next = prev;
            prev = b;
            b = front;
        }

        return prev;
    }

    public ListNode getKthNode(ListNode a, int k) {
        k -= 1;
        while (a != null && k > 0) {
            k--;
            a = a.next;
        }
        return a;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevLast = null;

        while (temp != null) {
            ListNode kThNode = getKthNode(temp, k);
            if (kThNode == null) {
                if (prevLast != null) {
                    prevLast.next = temp;
                }
                break;
            }

            ListNode nextNode = kThNode.next;
            kThNode.next = null;
            reverseLinkedList(temp);

            if (temp == head) {
                head = kThNode;
            } else {
                prevLast.next = kThNode;
            }

            prevLast = temp;
            temp = nextNode;
        }

        return head;
    }  
}