package Lec_2;

public class SwapInArray {
   public static void swap(int [] arr) {
	   
	   int temp=arr[0];
	   arr[0]=arr[1];
	   arr[1]=temp;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= new int[2];
      arr[0]=12;
      arr[1]=13;
      System.out.println(arr[0]+ " , "+ arr[1]);
      swap(arr);
      System.out.println(arr[0]+ " , "+ arr[1]);
	}

}
