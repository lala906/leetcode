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
    public ListNode swapNodes(ListNode head, int k) {
         ListNode slow = head;
        ListNode fast = head;


        for (int i =1; i<k;i++){
            slow=slow.next;
        }

        int length=1;
        ListNode temp= head;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        
        for(int i =1;i<length-k+1;i++){
            fast=fast.next;
        }
      int temp1= slow.val;
        slow.val=fast.val;
        fast.val=temp1;
         return head;

    }
}