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
        ListNode fast;
        ListNode slow;
        fast=head;
        slow=head;
        
        if(head==null)
        return false;
        if(fast.next==null)
        return false;
        if(slow==slow.next)
        return true;
        
        fast=fast.next.next;
        slow=slow.next;
        
        while(fast != null && fast.next != null){
            fast=fast.next.next;
        slow=slow.next;

            if(fast==slow){
                return true;
            }

        }return false;

        
    }
}