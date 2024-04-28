/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// 4 -> 5 -> 9 -> 2 -> 3 -> 6 -> 7 
// p.next = null     c    n.val
// O(N)

class Solution {
    public void deleteNode(ListNode node) {
        ListNode prev = null;
        ListNode current = node;
        while(current != null){
            // System.out.println(current.val);
            ListNode next  = current.next;
            if(next == null){
                prev.next = null;
                return;
            }
            
            current.val = next.val;
            prev = current;
            current = next;
        }
    }
}