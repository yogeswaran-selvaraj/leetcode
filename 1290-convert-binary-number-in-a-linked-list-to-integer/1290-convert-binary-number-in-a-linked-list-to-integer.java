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
    public int getDecimalValue(ListNode head) {
        head = reverList(head);
        int ans = 0;
        ListNode cur = head;
        int multiple = 1;
        while(cur != null){
            if(cur.val == 1){
                ans += multiple;
            }
            
            cur = cur.next;
            multiple *= 2;
        }
        
        return ans;
    }
    
    ListNode reverList( ListNode A){
        ListNode cur = A;
        ListNode prev = null;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        
        return prev;
    }
}