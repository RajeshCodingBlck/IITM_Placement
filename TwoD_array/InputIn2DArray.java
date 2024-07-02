package TwoD_array;

import java.util.Scanner;

public class InputIn2DArray {
   
	public static void Display(int [][] arr) {
		
		int rows= arr.length;
		System.out.println(rows);
		int cols= arr[1].length;
		System.out.println(cols);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [][] arr=new int[3][4];
      
      // Loop for Row
      Scanner s= new Scanner(System.in);
      for(int row=0;row<3;row++) {
    	  // loop for cols
    	  for(int col=0; col<4;col++) {
    		  arr[row][col]=s.nextInt();
    	  }
      }
      
//      for(int row=0;row<3;row++) {
//    	  // loop for cols
//    	  for(int col=0; col<4;col++) {
//    		  //arr[row][col]=s.nextInt();
//    		  System.out.print(arr[row][col]+ " ");
//    	  }
//    	 System.out.println(); 
//      }
      Display(arr);
      
      //System.out.println(arr);
	}

}
