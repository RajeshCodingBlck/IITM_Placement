package Recursion2;

public class PrintCombination {
    
	public static void PrintCombination(int n,  String ansSoFar) {
		
		
		if(n==0) {
			System.out.println(ansSoFar);
			return;
		}
		
		PrintCombination(n-1,  ansSoFar+ "H");
		PrintCombination(n-1,  ansSoFar+ "T");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintCombination(3, "");
	}

}
