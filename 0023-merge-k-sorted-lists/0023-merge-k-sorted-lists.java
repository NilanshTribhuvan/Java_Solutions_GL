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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> p=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode list:lists){
            if(list!=null){
                p.add(list);
            }
        }
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(!p.isEmpty()){
            ListNode node=p.poll();
            temp.next=node;
            temp=node;
            if(node.next!=null){
                p.add(node.next);
            }
        }
        return dummy.next;
    }
}