package OOPs_1;

public class A {
   
	int val;
	
	A(){
		this(34);
//		this(34);
		System.out.println("Constructor 1 is Called");
		
	}
	
	A(int val){
		System.out.println("Constructor 2 is Called");
		this.val=val;
	}
}
