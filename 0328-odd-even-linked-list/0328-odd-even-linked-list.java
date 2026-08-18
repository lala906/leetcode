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
    public ListNode oddEvenList(ListNode head) {
        
        ListNode olddummy = new ListNode (-1);
        ListNode evendummy = new ListNode (-1);
        ListNode i =olddummy ;
        ListNode j = evendummy ;
        ListNode temp = head;
        int pos =1;
        while(temp!=null){
            if(pos % 2 != 0){
                i.next=temp;
                i=i.next;
            }
            else {
                j.next = temp;
                j=j.next;
            }
            temp = temp.next;
            pos++;

        }
        i.next=evendummy.next;
        j.next = null;
        return olddummy.next;
    }
}