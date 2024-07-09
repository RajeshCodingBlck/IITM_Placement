package Recursion3;

public class StairProblemThreeJump {
    
	public static void Stair(int n, String ans) {
		
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		if(n<0) {
			return;
		}
		// 1 ka Junp
		 Stair(  n-1, ans+ "1");
		//2 ka jump
		 Stair(  n-2, ans+ "2");
		// 3 ka jump
		 Stair(  n-3, ans+ "3");
//		 
//		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Stair(7, "");
	}

}
