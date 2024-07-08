package Recursion2;

public class LinearSearch {
     
	// Defination ==> 
	//index i se Start hone vala array ke under target value 
	// Search karni he
	public static boolean linearSearch(int [] arr, int i, int target) {
		
		if(i==arr.length) {
			return false;
		}
		
		 boolean chhota_ans= linearSearch(arr, i+1, target);
		 
		 if(chhota_ans ==true || arr[i]==target) {
			 return true;
		 }else {
			 return false;
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr= {1,3,10,14,12,5,6};
        int target=12;
       boolean ans= linearSearch(arr, 0,target);
       System.out.println(ans);
	}

}
