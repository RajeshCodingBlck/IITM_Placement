package OOPs_1;

public class clientOfA {
    
	public static void swap( A obj1, A obj2 ) {
		
//		A temp= obj1;
//		obj1=obj2;
//		obj2=temp;
		
		int temp= obj1.val;
		obj1.val=obj2.val;
		obj2.val=temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       A obj1= new A(12);
//       A obj2= new A(13);
//       System.out.println("Before Swap "+ obj1.val + " "+ obj2.val);
//       swap(obj1, obj2);
//       System.out.println("After Swap "+ obj1.val + " "+ obj2.val);
       
		A obj3= new A();
		
	}

}
