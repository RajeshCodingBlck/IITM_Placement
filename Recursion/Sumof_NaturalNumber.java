package Recursion;

public class Sumof_NaturalNumber {
    
	// Defination :- Agar Me Isko N dunga to ye kya dega  1+2+3 +4 ....N
	public static int Sum(int n) {
		
		//return n==0 ? 0 : n+ Sum(n-1);
		
		 if(n==1) {
			 return 1;
		 }
		
		if(n==0) {
			return  0;
		}
		
		  int chhota_ans=Sum(n-1);
		  int mera_ans= chhota_ans+ n;
		  return mera_ans;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(Sum(10));
	}

}
