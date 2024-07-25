package MyLinkedList;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

    
public class Detect_cycle_inLinkedList_leetcode {
    
public static boolean hasCycle(Node head) {
        
        Node fast=head;
        Node slow= head;

        while(fast != null  && fast.next !=null){

            fast= fast.next.next;
            slow=slow.next;

            if(slow==fast){ // 1st meeting
               
            	return true;
            }
        }

        return false ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list=new MyLinkedList();
		list.InsertAtEnd(10);
		list.InsertAtEnd(20);
		list.InsertAtEnd(30);
		list.InsertAtEnd(40);
		list.InsertAtEnd(50);
		list.InsertAtEnd(60);
		list.Display();
		
		//calling the hasCycle function to detect cycle is present or not?
		boolean isCycle=hasCycle(list.head);
		System.out.println(isCycle);
	}

}
