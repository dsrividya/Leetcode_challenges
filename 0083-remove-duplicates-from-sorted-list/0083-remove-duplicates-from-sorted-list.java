/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }*/

 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // If the list is empty or has only one node, nothing to do
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        
        // Traverse through the list
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Skip duplicate node
                current.next = current.next.next;
            } else {
                // Move forward
                current = current.next;
            }
        }
        
        return head;
    }
}