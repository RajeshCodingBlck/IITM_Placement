package Recursion2;

public class BitCombination {

   public static void PrintCombination(int n,  String ansSoFar) {
		
		
		if(n==0) {
			System.out.println(ansSoFar);
			return;
		}
		
		PrintCombination(n-1,  ansSoFar+ "0");
		PrintCombination(n-1,  ansSoFar+ "1");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintCombination(3, "");
	}

}
