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
		System.out.println();
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
	
	public void removeAtBegin() throws Exception{
		
		// Hamara LinkedList is Empty
		if(head==null) {
			throw new Exception("LinkedList is Empty");
		}
		
		Node temp=head;
		head=head.next;
		temp.next=null;
	}
	
	public void removeAtEnd() {
		
		if(head==null) {
			// throw Exception 
		}
		
		if(head.next==null) {
			head=null;
			return;
		}
		
		Node temp=head;
		while(temp.next.next !=null) {
			temp=temp.next;
		}
		
		temp.next=null;
		
		
	}
	public void InsertAtBetween(int val, int index) {
		
		int jump=index-1;
		Node temp= head;
		
		while(jump>0) {
			temp=temp.next;
			jump--;
		}
		Node newNode= new Node(val);
		
		Node temp2= temp.next;
		newNode.next=temp2;
		temp.next=newNode;
	}
	public void removeAtBetween(int index) {
		
		int jump=index-1;
		Node temp= head;
		
		while(jump>0) {
			temp=temp.next;
			jump--;
		}
		
		Node temp2= temp.next;
		temp.next= temp.next.next;
		temp2.next=null;
		
		
	}
	
	
}
