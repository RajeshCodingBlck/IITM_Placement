package TwoD_array;

public class Tranpose_in_SquareMatrix {
   
	public static void Transpose(int [][ ] arr) {
		
		for(int i=0; i<arr.length;i++ ) {
			for(int j=i; j<arr[0].length;j++) {
				
				// Swap (i,j) and (j,i)
				
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [][] arr= {
    		  {1,2},
    		  {3,4}
      };
      
      Transpose(arr);
      for(int i=0; i<arr.length;i++ ) {
			for(int j=0; j<arr[0].length;j++) {
				
	     System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
      
	}

}
