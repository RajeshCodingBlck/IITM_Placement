package Recursion2;

public class Case_study {
 
	public static void fun(int i, int n) {
		
		if(i==n) {
			return;
		}
		fun(i++,n);
		System.out.println(i);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // fun(1, 4);
		
//		int a=12;
//		int b= a;
//		a=a+1;
//		i++;
//		System.out.println(a);
//		System.out.println(b);
		
//		int i=5;
//		System.out.println(i++);
//		System.out.println(i);
		
		int a=12;
		int b= ++a;
		System.out.println(a);
		System.out.println(b);
		
	}

}
