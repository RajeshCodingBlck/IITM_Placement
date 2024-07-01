package lec_5;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      
      int n= s.nextInt();
      int ans=0;
      int place_value=1;
      
      while(n>0) {
    	  
    	  int last_digit= n%10;
    	  
    	  ans= ans+ last_digit*place_value;
    	  
    	  n=n/10;
    	  place_value *=2;
      }
      
      System.out.println(ans);
      
	}

}
