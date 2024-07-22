package MyLinkedList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
//	   int val= (int)1e10;  // 10^10
//	   int [] arr= new int[val];
		
	   // Create the Node Object
		Node n1= new Node(20);
		System.out.println(n1.data);
		System.out.println(n1.next);
		Node n2= new Node(30);
		System.out.println(n2.data);
		System.out.println(n2.next);
		
		Node n3= new Node(40);
		
		n1.next= n2; // Creating a Link between n1 and n2
		n2.next=n3; // Creating a Link between n2 and n3
		
		Node head=n1;
		
		
		
		
	   
	   
	}

}
