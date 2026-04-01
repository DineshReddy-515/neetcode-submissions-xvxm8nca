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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int c=0;
        while(temp != null){
            temp=temp.next;
            c++;
        }
        if(c==n) return head.next;
        c=c-n;
        temp=head;
        while(c-->1){
            temp=temp.next;
        }
        if(temp.next!= null) temp.next=temp.next.next;
        else temp.next=null;
        return head;
    }
}
