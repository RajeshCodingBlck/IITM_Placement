package LinkedListQuestion;

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

    public ListNode mergeNodes(ListNode head) {
        
        ListNode temp= head.next;
        int sum=0;
        
        ListNode dummy= new ListNode();
        ListNode new_head= dummy;
        ListNode new_tail=dummy;

        while(temp !=null){
            if(temp.val==0){
          ListNode newNode= new ListNode(sum);

             new_tail.next=newNode;
             new_tail= newNode;
             sum=0;
            }else{
                sum+=temp.val;
            }
            temp=temp.next;
        }

   return new_head.next;
    }
}

public class MergeNodeBetweenZero {

}
