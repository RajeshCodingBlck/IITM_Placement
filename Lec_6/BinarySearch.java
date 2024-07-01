package Lec_6;

public class BinarySearch {
  
	public static int binarySearch(int [] arr, int target) {
		// Search Space is array.
		int low=0;
		int high= arr.length-1;
		
		while(low<=high) {
			
			int mid= (low+high)/2;
			
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]> target) {
				high=mid-1;
			}else {
				low=mid+1;
			}
			
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {1,3,4,6,7,10,11};
     int target=12;
     int index=binarySearch(arr, target);
     System.out.println(index);
	}

}
