package Recursion2;

import java.util.ArrayList;

public class PrintCoinCombination {
   
	public static ArrayList<String> coin(int n){
		
		if(n==1) {
			ArrayList<String> base_ans= new ArrayList();
			base_ans.add("H");
			base_ans.add("T");
			
			return base_ans;
		}
	
		ArrayList<String> chhota_ans= coin(n-1);
		ArrayList<String> mera_ans= new ArrayList();
		
		for(int i=0;i<chhota_ans.size();i++) {
			mera_ans.add("H"+ chhota_ans.get(i));
			mera_ans.add("T"+ chhota_ans.get(i));
		}
		
		return mera_ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println(coin(2));
	}

}
