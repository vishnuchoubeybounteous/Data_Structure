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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)return head;
      ListNode dum=new ListNode(-1);
      ListNode prev=dum;
      ListNode temp=head;
      head=head.next;
      while(temp!=null&&temp.next!=null){
        ListNode f1=temp.next;
        ListNode f2=f1.next;
        prev.next=f1;
        temp.next=f2;
        f1.next=temp;
        prev=temp;
        temp=f2;
      } 
      return head; 
    }
}