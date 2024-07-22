package MyLinkedList;

public class MyLinkedList {

	Node head;
	
	// Behaviour Insert A Node At Begin
	public void InsertAtBegin(int val) {
		
		Node newNode= new Node(val);
		newNode.next=head;
		
		head=newNode;
		
	}
	
	public void Display() {
		Node temp=head;
		while(temp !=null) {
			System.out.print(temp.data + " -> ");
			temp=temp.next;
		}
	}
	
	public void InsertAtEnd(int val) {
		
		
		if(head==null) { // LinkedList is Empty
			
			InsertAtBegin(val);
			return;
		}
		Node temp=head;
		while(temp.next !=null) {
			temp=temp.next;
		}
		
		// Create a New Node
		Node newNode= new Node(val);
		
		temp.next=newNode;
		
		
	}
	
	
}
