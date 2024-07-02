package TwoD_array;

import java.util.Scanner;

public class ColZigZag {

	public static void ColWiseZigZag(int [][] arr) {
		
		int n= arr.length;
		int m= arr[0].length;
		
		// loop for col
		for(int j=0; j<m;j++) {
			
			if(j%2==0) { // when col is even
				
				// row loop
				for(int i=0; i<n;i++) {
					System.out.print(arr[i][j]+" ");
				}
			}else { // when col is odd
				
				// row loop
				for(int i=n-1; i>=0;i--) {
					System.out.print(arr[i][j]+" ");
				}
			}
			
			System.out.println();
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();// Number of Rows
		int m = s.nextInt(); // Number of Columns
		int[][] arr = new int[n][m];

		// Input
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		ColWiseZigZag(arr);
	}

}
