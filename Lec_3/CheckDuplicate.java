package Lec_3;

import java.util.Scanner;

public class CheckDuplicate {

	public static boolean checkDuplicate(int [] arr) {
		
		for(int i=0; i< arr.length;i++) {
			
			for(int j= i+1; j< arr.length;j++) {
				
				if(arr[i]== arr[j]) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s= new Scanner(System.in);
     int size= s.nextInt();
     
     int [] arr= new int[size];
     
     // Input
     for(int i=0; i<arr.length;i++) {
    	 arr[i]=s.nextInt();
     }
     boolean ans= checkDuplicate(arr);
     System.out.println(ans);
     
	}

}
