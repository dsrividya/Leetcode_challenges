/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;  // If list is empty or has only one element, no cycle
        }
        
        ListNode slow = head;   // Slow pointer moves one step at a time
        ListNode fast = head;   // Fast pointer moves two steps at a time
        
        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow pointer by one step
            fast = fast.next.next;    // Move fast pointer by two steps
            
            if (slow == fast) {       // If slow and fast meet, there is a cycle
                return true;
            }
        }
        
        return false;  // If fast reaches the end, no cycle exists
    }
}
