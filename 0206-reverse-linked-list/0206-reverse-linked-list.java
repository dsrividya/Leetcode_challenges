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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;  // Initialize the previous node as null
        ListNode curr = head;  // Start with the head of the list
        
        while (curr != null) {  // Traverse the list until the end
            ListNode next = curr.next;  // Temporarily store the next node
            curr.next = prev;  // Reverse the current node's next pointer
            prev = curr;  // Move prev to the current node
            curr = next;  // Move curr to the next node
        }
        
        return prev;  // Return the new head (prev is the last node)
    }
}
