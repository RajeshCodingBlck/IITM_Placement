package Wrapper_demo;

public class Case_1 {

	public static void update(int a, Integer b) {
	
		a++;
		b++;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=12;
       Integer b=13;
       System.out.println("Before Call "+ a+ " , "+ b);
       update(a,b);
       System.out.println("After Call "+ a+ " , "+ b);
       
	}

}
