package lec_5;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    
	
	public static int DecimalToAnyBase(int n, int db) {
		
		int ans=0;
	      int place_value=1;
	      while(n>0) {
	    	  
	    	  int rem= n%db;
	    	  ans= rem*place_value + ans;
	    	  
	    	  place_value *=10;
	    	  n=n/db;
	      }
	      
	      //System.out.println(ans);
	      return ans;
	}
	public static int AnyBaseTodecimal(int n, int sb) {
		
		  int ans=0;
	      int place_value=1;
	      
	      while(n>0) {
	    	  
	    	  int last_digit= n%10;
	    	  
	    	  ans= ans+ last_digit*place_value;
	    	  
	    	  n=n/10;
	    	  place_value *=sb;
	      }
	      
//	      System.out.println(ans);
	      return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s= new Scanner(System.in);
         int n= s.nextInt();
         int sb= s.nextInt();
         int db= s.nextInt();
        int decimal_number= AnyBaseTodecimal(n, sb);
         int final_ans= DecimalToAnyBase(decimal_number, db);
         System.out.println
	}

}
