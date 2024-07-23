package MyLinkedList;


public class Client_forLinkList {

	
	public static Node Reverse(Node head) {
		
		if(head.next==null) {
			return head;
		}
		Node temp= head.next;
		head.next=null;
		
		Node  reverse_Head= Reverse(temp);
		temp.next=head;
		return reverse_Head;
		
		
	}
	
	public static int getSize(Node head) {
		
		int size=0;
		while(head !=null) {
			head=head.next;
			size++;
		}
		
		return size;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	    MyLinkedList list= new MyLinkedList();
	    
	    list.InsertAtBegin(10);
	    list.InsertAtBegin(20);
	    list.InsertAtBegin(30);
	    list.Display();
	    System.out.println();
	    System.out.println(getSize(list.head));
	    System.out.println(getSize(list.head));
	    
	    //	     
//	    list.InsertAtEnd(60);
//	    
//	    System.out.println();
//	    list.Display();
//	    
//        list.InsertAtEnd(80);
//	    
//	    System.out.println();
//	    list.Display();
	    
//	    list.InsertAtEnd(50);
//	    System.out.println();
////	    list.Display();
//	  list.head= Reverse(list.head);
//	  list.Display();
	    
	    
	    
	    
	    
	    
	    
	}

}
