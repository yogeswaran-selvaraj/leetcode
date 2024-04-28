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

// 1 -> 2 -> 3 -> 4 -> 5

// 1) get the count (5)
// 2) count - n traverse (5 - 2)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        
        if(count == 1){
            return temp;
        }
        
        // System.out.println(count);
        temp = head;
        if(count - n == 0){
            return head.next;
        }
        
        for(int i=1; i<(count - n); i++){
            temp = temp.next;
        }
        
        temp.next = temp.next.next;
        
        return head;
    }
}