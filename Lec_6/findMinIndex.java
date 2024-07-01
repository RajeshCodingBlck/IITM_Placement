package Lec_6;

public class findMinIndex {

	public static int TargetValue(int [] arr, int target) {
		
		int low=0;
		int high=arr.length-1;
		
		int pc_ans=-1;
		while(low<=high) {
			
			int mid= (low+high)/2;
			if(arr[mid]==target) {
				pc_ans=mid;
				high=mid-1;
			}else if(arr[mid]> target) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		
		return pc_ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,1,2,2,2,2,2,2,2,3,4,5,5,5,6};
      int target=4;
      System.out.println(TargetValue(arr, target));
      
	}

}
