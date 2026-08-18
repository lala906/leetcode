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
    public ListNode partition(ListNode head, int x) {
        ListNode t1 = new ListNode (-1);
        ListNode t2 =new ListNode (-2);
        ListNode i = t1;
        ListNode j = t2;
        ListNode temp = head;
        while(temp!=null){
        if(temp.val < x){
            i.next=temp;
            i=i.next;
            
        }
        else{
            j.next=temp;
            j=j.next;
           
        }
        temp = temp.next;
        }
        j.next=null;

        i.next=t2.next;
        return t1.next;
    }
}