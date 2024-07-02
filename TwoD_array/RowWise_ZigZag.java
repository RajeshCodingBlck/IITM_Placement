package TwoD_array;

import java.util.Scanner;

public class RowWise_ZigZag {

	public static void RowWiseZigZag(int [] [] arr) {
		
		int n=arr.length; // Number of Rows
		int m= arr[0].length;// Number of Cols.
		for(int i=0; i<n;i++) {
			
			if(i%2 == 0) {
				for(int j=0; j<m;j++) {
					System.out.print(arr[i][j]+" ");
				}
				
			}else {
				
				for(int j=m-1; j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// N*M
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
		RowWiseZigZag(arr);

	}

}
