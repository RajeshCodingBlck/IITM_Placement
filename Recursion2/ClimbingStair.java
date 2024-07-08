package Recursion2;

public class ClimbingStair {
    
	public static void Stair(int n, String ansSofar) {
		
		
		if(n==0) {
			System.out.println(ansSofar);
			return;
		}
		
		if(n<0) {
			return ;
		}
		
		
		// nth
	    // 1 ka Jump
		Stair(n-1,  ansSofar+"1");
		// 2 ka jump
		Stair(n-2,  ansSofar+"2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Stair(7, "");
	}

}
