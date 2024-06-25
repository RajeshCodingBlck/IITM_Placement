package Array_lecture;

import java.util.Scanner;

public class HowTocreateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	  Scanner s= new Scanner(System.in);
	  int [] arr= new int[5];
	  
//	  arr[0]= s.nextInt();
//	  arr[1]=s.nextInt();
//	  arr[2]=s.nextInt();
	  
	  // Input 
	  for(int i=0;i<5;i++) {
		  System.out.println("Take input for "+ i);
		  arr[i]= s.nextInt();
	  }
	  
	  // How to Print the Array
	 // System.out.println(arr); Ye kaam Mat karna
	  for(int i=0; i<5;i++) {
		  System.out.print(arr[i]+ " ");
	  }
	  System.out.println();
	  System.out.println("length of array "+ arr.length);
	  
	  // Array ka length hum arr.length se nikal Sakte he.
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}

}
