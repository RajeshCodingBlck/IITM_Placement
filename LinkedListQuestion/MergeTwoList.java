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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        

        ListNode dummy= new ListNode();
        ListNode newHead=dummy;
        ListNode newTail=dummy;

        ListNode i= list1;
        ListNode j= list2;

        while(i != null && j !=null){

             if(i.val < j.val){
            ListNode newNode= new ListNode(i.val);
              newTail.next=newNode;
              newTail=newNode;
              i= i.next;
             }else{
               ListNode newNode= new ListNode(j.val);
              
              newTail.next=newNode;
              newTail=newNode;
              j=j.next;
             }
        }
        while(i !=null){
            ListNode newNode= new ListNode(i.val);
              newTail.next=newNode;
              newTail=newNode;
              i= i.next;
        }

        while(j !=null){
           ListNode newNode= new ListNode(j.val);
              newTail.next=newNode;
              newTail=newNode;
              j=j.next;

        }
        return dummy.next;





    }
}
public class MergeTwoList {

}
