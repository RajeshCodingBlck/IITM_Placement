package Lec_2;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        
        int a= s.nextInt();
        int b= s.nextInt();
        
        int temp= a;
        a=b;
        b=temp;
        System.out.println(a+ " "+ b);
        
        
	}

}
