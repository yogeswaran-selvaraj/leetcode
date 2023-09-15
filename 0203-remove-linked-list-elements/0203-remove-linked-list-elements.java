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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        if(head == null){
            return null;
        }
        
        ListNode prev = null;
        head = null;
        while(temp != null){
            ListNode next = temp.next;
            if(temp.val == val){
                if(prev != null){
                    prev.next = temp.next;
                }else{
                    temp.next = null;
                }
            }
            
            if(head == null && temp.val != val){
                head = temp;
            }
            
            if(temp.val != val){
                prev = temp;
            }
            
            temp = next;
        }
        
        return head;
    }
}