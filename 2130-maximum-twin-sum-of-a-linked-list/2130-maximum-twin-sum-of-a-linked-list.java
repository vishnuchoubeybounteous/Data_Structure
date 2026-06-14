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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode fast=temp.next;
            temp.next=prev;
            prev=temp;
            temp=fast;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        if(prev!=null)prev.next=null;
        ListNode h1=reverse(slow);
        int max=0;
        while(head!=null){
          max=Math.max(max,head.val+h1.val);
          head=head.next;
          h1=h1.next;
        }
        return max;

    }
}