package Recursion3;

public class Permutation {
    
	public static void Permutation(String str, String ans) {
		
		 if(str.length()==0) {
			 System.out.println(ans);
			 return;
		 }
		
		for(int i=0; i<str.length();i++) {

			char ch= str.charAt(i);
			String remaining_left= str.substring(0, i);
			String remaining_right= str.substring(i+1);
			String chhota_str= remaining_left+ remaining_right;
			
			Permutation(chhota_str, ans+ch);
			
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Permutation("aab", "");
	}

}
