package RecursionAndBackTracking;

public class PrintParenthesis {
    
	public static void Print(int remOpening, int remClosing, String ans) {
		
		
		if(remOpening <0 || remClosing <0) {
			
			return;
		}
		
		if(remOpening ==0 && remClosing==0) {
			System.out.println(ans);
			return;
		}
		
		if(remOpening> remClosing) {
			return;
		}
		
		Print( remOpening-1,remClosing  , ans+ "(");
		Print( remOpening, remClosing-1, ans+ ")");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		int n=3;
		Print(n, n, "");
	}

}
