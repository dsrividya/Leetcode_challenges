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
        if (head == null || head.next == null || k == 0) 
        return head;

        // Step 1: Count length of list
        ListNode curr = head;
        int n = 1;
        while (curr.next != null) {
            curr = curr.next;
            n++;
        }

        // Step 2: Connect tail to head (make it circular)
        curr.next = head;

        // Step 3: Find new tail: (n - k % n - 1)th node
        k = k % n;
        int stepsToNewTail = n - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        // Step 4: Set new head and break the circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
