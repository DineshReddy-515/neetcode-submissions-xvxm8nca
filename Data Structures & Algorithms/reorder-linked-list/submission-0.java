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
        ListNode fast=head,slow=head;
        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode temp=slow;
        slow=slow.next;
        temp.next=null;

        temp=slow;
        ListNode prev=null;
        while(temp != null){
            ListNode t=temp.next;
            temp.next=prev;
            prev=temp;
            temp=t;
        }

        slow=head;
        while(prev!= null && slow != null){
            
            ListNode s2=slow.next;
            ListNode p2=prev.next;
            slow.next=prev;
            prev.next=s2;
            slow=s2;
            prev=p2;
            
        }


    }
}
