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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int c=0;
        ListNode temp=head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        
        ListNode c1=null,c2=null;
        c2=dummy;
        while(temp!=null){
            c++;
            if(left==c){
                c1=temp;
                break;
            }
            c2=c2.next;
            temp=temp.next;
            
        }
        
        ListNode prev=null;
        ListNode curr=c1,next=null;

        int count=right-left+1;
        while(count > 0){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count--;
        }

        c2.next=prev;
        c1.next=curr;
        return dummy.next;
        
    }
}