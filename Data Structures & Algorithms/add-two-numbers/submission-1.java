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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=l1;
        int num1=0;
        int c=0;
        while(temp != null){
            num1 +=temp.val*Math.pow(10,c);
            c++;
            temp=temp.next;
        }
        c=0;
        temp = l2;
        int num2=0;
        while(temp != null){
            num2 +=temp.val*Math.pow(10,c);
            c++;
            temp=temp.next;
        }
        int num=num1+num2;
        if(num==0){
            return new ListNode(num);
        }
        ListNode head=null,curr=null;
        while(num != 0){
            int n=num%10;
            num=num/10;
            ListNode newnode=new ListNode(n);
            if(head==null){
                head=newnode;
                curr=newnode;
            }else{
                curr.next=newnode;
                curr=curr.next;
            }
        }
        return head;
        
    }
}
