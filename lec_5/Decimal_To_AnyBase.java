package lec_5;

import java.util.Scanner;

public class Decimal_To_AnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      int n= s.nextInt();
      int db= s.nextInt();
      int ans=0;
      int place_value=1;
      while(n>0) {
    	  
    	  int rem= n%db;
    	  ans= rem*place_value + ans;
    	  
    	  place_value *=10;
    	  n=n/db;
      }
      
      System.out.println(ans);
      

}
}
