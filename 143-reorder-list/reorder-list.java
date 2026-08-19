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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        ListNode current = slow.next;
       
        ListNode previous = null;
        slow.next=null;
        while(current!=null){
           ListNode forward = current.next;
            current.next=previous;
            previous = current ;
            current=forward;
        }
       
        ListNode t1=head;
        ListNode t2 = previous;
        ListNode temp=head;
        while(t2!=null){
            ListNode temp1 = t1.next;
            ListNode temp2= t2.next;

            t1.next = t2;
            t2.next = temp1;

            t1 = temp1;
            t2 = temp2;
           
        }
      
    }
}