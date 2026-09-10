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
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode frwd = null;
        while(curr!=null){
            frwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = frwd ;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy ;
        dummy.next = head;
        for(int i = 1;i<=left-1;i++){
            temp=temp.next;

        }
        ListNode tail1 = temp;
        ListNode head1 = temp.next;
        ListNode tail2 = head1;
        for(int i = 1 ; i<=right-left;i++){
            tail2 = tail2.next;
        }
       
        ListNode head2 = tail2.next;
        tail1.next=null;
        tail2.next = null;
        reverse(head1);
        tail1.next = tail2;
        head1.next = head2;
        return dummy.next;
    }
}