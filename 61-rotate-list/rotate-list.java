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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
      ListNode temp1=head;
        int length = 0;
       if (head == null || head.next == null || k == 0)
            return head;

        while(temp1!=null){
            temp1=temp1.next;
            length++;
        }
        k %=length;

    if(k==0) return head;
        for(int i =0 ; i<= k;i++){
            fast = fast.next;
        }
       while(fast!=null){
        slow=slow.next;
        fast=fast.next;
       }
        ListNode temp = slow.next;
       
        slow.next=null;
         ListNode a = temp;
        while(a.next!=null){
            a=a.next;
        }
        a.next=head;
        return temp; 
        
    }
}