package lec_5;

import java.util.Scanner;

public class reverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      int n= s.nextInt();
      
      int ans=0;
      while(n>0) {
    	  int last_digit= n%10;
    	  ans= ans*10+ last_digit;
    	  n= n/10;
      }
      System.out.println(ans);
      
	}

}
