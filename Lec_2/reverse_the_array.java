package Lec_2;

import java.util.Scanner;

public class reverse_the_array {

	public static void reverse(int [] arr) {
		// Define the pointer
		int i=0;
		int j=arr.length -1;
		
		while(i<=j) {	
			// Swap
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			i++;
			j--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      int n= s.nextInt();
      int [] arr= new int[n];
      
      for(int i=0; i<n;i++) {
    	  arr[i]=s.nextInt();
      }
      
      reverse(arr);
     // System.out.println(arr);
      for(int i=0; i<arr.length;i++) {
    	  System.out.print(arr[i]+" ");
      }
      
      
      
      
	}

}
