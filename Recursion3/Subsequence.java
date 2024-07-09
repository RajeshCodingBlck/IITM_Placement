package Recursion3;

public class Subsequence {

	public static void printSubsequence(String str, String ans) {
		
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		
		char ch= str.charAt(0);
		String chhota_str=  str.substring(1);
		

		// 0 vale vale charcter ko nahi lunga
		printSubsequence( chhota_str, ans+"");
		// 0 index ko lunga
		printSubsequence( chhota_str, ans+ch);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSubsequence( "abc", "");
	}

}
