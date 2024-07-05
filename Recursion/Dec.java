package Recursion;

public class Dec {
    
	public static void Dec(int n) {
		
		if(n==0) {
			return;
		}
		System.out.println(n);
		Dec(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Dec(5);
	}

}
