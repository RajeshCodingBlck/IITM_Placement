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

    public static int getSize(ListNode head) {
		
		int size=0;
		while(head !=null) {
			head=head.next;
			size++;
		}
		
		return size;
	}
    public ListNode middleNode(ListNode head) {
        
        ListNode fast=head;
        ListNode slow= head;

        while(fast != null  && fast.next !=null){

            fast= fast.next.next;
            slow=slow.next;
        }

        return slow;

    }
}
public class MiddleTwoLinkedList {

}
