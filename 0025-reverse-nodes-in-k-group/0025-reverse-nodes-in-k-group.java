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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode kth=kth(temp,k);
            if(kth==null){
                if(prev!=null){
                    prev.next=temp;
                    break;
                }
            }
            ListNode nextNode=kth.next;
            kth.next=null;
            ListNode newHead=reverse(temp);
            if(temp==head){
                head=newHead;
            }else{
                prev.next=newHead;
            }
            prev=temp;
            temp=nextNode;

        }
        return head;
    }
    public ListNode kth(ListNode temp,int k){
        
        while(temp!=null && k>1){
            temp=temp.next;
            k--; 
        }
        return temp;
    }
    public ListNode reverse(ListNode temp){
        ListNode curr=temp;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}