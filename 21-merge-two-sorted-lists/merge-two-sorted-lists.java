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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode i = list1;
      ListNode j = list2;
      ListNode tail = new ListNode (-1);
      ListNode dummy = tail;
      while(i!=null && j!=null ){
        if(i.val<=j.val){
            dummy.next=i;
           
            i=i.next;
        }
        else if (j.val<i.val){
            dummy.next=j;
            
            j=j.next;
        }
        dummy = dummy.next;
       
      }
       if (i != null) {
            dummy.next = i;
        } 
        else {
            dummy.next = j;
        }

      return tail.next;
    }
}