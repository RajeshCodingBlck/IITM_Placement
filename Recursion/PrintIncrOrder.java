package Recursion;

public class PrintIncrOrder {
   
	public static void Incr(int n) {
		
		if(n==1) {  // +ve 
			System.out.println(1);
			return;
		}
		if(n==0) {
			return;
		}
		
		Incr(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Incr(5);
	}

}
