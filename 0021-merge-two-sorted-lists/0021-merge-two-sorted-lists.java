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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode l= list1;
      ListNode m= list2;
      ListNode curr= new ListNode(-1);
      ListNode dummy=curr;
      while(l!=null&& m!=null)
      {
         if(l.val<m.val)
         {
            dummy.next=l;
            l=l.next;
         }
         else
         {
            dummy.next=m;
            m=m.next;
         }
         dummy= dummy.next;
      }
      if(l!=null)
      {
        dummy.next=l;
       
      }
     else
      {
        dummy.next=m;
       
      }
       return curr.next; 
        
    }
}