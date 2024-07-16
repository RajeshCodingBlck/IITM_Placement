package OOPs_Example;

class Pair{
	
	int index;
	boolean isPresent;
	Pair(int index, boolean isPresent){
		this.index=index;
		this.isPresent=isPresent;
	}
}

public class LinearSearch {
    
	public static Pair LinearSearch(int [] arr, int target) {
		
		int index=-1;
		boolean isPresent=false;
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]==target) {
				index=i;
				isPresent=true;
			}
		}
		
		Pair obj = new Pair(index, isPresent);
		return obj;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int [] arr= {1,2,3,4,5,6,7};
		int target=10;
		Pair ans= LinearSearch(arr, target);
		System.out.println(ans.index + " "+ ans.isPresent);
	}

}
