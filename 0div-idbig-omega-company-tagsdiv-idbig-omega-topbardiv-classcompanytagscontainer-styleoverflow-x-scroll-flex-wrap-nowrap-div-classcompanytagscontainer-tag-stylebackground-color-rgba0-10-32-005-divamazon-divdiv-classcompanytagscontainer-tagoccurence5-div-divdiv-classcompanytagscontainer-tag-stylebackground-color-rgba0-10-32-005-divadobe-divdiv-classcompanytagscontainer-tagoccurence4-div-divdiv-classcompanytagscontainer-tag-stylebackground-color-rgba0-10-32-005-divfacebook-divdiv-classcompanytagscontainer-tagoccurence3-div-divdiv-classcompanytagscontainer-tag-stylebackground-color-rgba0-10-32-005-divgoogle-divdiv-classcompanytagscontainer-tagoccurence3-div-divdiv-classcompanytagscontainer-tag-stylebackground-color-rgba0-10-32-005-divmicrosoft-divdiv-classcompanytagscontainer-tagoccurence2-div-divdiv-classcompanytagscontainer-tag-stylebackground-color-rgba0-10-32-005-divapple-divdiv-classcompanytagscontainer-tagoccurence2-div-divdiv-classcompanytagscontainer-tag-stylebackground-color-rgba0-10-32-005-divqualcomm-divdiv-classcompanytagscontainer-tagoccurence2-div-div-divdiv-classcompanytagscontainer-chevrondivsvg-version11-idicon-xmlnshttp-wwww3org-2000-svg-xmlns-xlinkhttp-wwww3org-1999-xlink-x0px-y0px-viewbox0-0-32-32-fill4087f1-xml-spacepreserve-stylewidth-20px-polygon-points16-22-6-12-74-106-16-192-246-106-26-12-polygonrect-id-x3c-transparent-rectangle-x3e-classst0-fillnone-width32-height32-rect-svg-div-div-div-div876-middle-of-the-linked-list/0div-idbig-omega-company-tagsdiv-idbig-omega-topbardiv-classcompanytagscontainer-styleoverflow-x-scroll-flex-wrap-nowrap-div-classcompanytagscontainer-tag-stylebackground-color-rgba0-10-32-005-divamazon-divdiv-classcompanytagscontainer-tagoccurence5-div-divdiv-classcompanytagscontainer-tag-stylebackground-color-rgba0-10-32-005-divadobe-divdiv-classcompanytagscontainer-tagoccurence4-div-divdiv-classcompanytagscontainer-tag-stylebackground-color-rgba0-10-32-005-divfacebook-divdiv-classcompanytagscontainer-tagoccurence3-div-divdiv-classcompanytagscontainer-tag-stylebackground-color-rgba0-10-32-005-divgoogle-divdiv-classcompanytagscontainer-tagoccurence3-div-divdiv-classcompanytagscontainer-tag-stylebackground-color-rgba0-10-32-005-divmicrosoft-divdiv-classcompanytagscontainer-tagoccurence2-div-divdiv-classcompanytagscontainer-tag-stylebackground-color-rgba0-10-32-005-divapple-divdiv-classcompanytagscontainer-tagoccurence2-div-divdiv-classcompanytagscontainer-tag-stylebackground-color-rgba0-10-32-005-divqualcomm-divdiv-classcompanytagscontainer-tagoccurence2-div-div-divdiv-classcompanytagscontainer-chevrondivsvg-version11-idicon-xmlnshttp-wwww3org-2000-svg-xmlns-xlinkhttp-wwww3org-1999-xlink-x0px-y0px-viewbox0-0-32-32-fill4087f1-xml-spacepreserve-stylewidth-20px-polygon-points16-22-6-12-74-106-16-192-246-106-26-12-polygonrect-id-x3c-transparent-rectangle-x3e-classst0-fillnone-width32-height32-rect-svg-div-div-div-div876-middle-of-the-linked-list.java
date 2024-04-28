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
    //  1 2 3 4
    //    s
    //      f
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(slow != null){
            if(fast.next == null){
                return slow;    
            }
            
            if(fast.next.next == null){
                return slow.next;    
            }
            
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return null;
    }
}