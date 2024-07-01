package lec_5;

import java.util.Scanner;

public class Count_digit {

	public static int helper(int n, int digit) {
		
		int count=0;
		while(n>0) {
			
			int last_digit= n%10;
			if(last_digit== digit) {
				count++;
			}
			n=n%10;
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       
       int n= s.nextInt();
       int digit= s.nextInt();
       
       int count=  helper(n, digit);
       System.out.println(count);
	}

}
