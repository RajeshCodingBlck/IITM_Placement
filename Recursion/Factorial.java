package Recursion;

public class Factorial {
    
	// define your function 
	// function ko n denge to uska n! la kar dega.
	public static int fact(int n) {
		
		 if(n==0) {
			 
			 return 1;
		 }
		 int chhota_ans= fact(n-1);
		 int mera_ans= n*chhota_ans;
		 return mera_ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int n=5;
	    System.out.println(fact(n));
	}

}
