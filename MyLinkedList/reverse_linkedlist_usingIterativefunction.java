package MyLinkedList;

public class reverse_linkedlist_usingIterativefunction {
	public static Node reverse(Node head) {
		Node prev=null;
		Node curr=head;
		
		while(curr!=null) {
			Node temp=curr.next;
			curr.next=prev;
			
			//shifting of prev and curr node...
			prev=curr;
			curr=temp;
		}
		
		return prev;
	}
	public static void main(String args[]) {
		
		MyLinkedList list=new MyLinkedList();
		list.InsertAtEnd(10);
		list.InsertAtEnd(20);
		list.InsertAtEnd(30);
		list.InsertAtEnd(40);
		list.InsertAtEnd(50);
		list.InsertAtEnd(60);
		list.Display();
		
		//reverse the linked list.....
		Node newHead=reverse(list.head);
		
		//update the head of older linked list to head of reversed linkedlist....
		list.head=newHead;
		list.Display();
	}
}
