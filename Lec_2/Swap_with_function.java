package Lec_2;

import java.util.Scanner;

public class Swap_with_function {
 
	public static void swap(int a, int b) {
		
		int temp= a;
		a=b;
		b=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      int a= s.nextInt();
      int b= s.nextInt();
      System.out.println("Before Swap "+ a+ " , "+b);
      swap(a,b);
      System.out.println("After Swap "+ a+ " , "+b);
      
	}

}
