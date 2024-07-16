package OOPs_Example;

class Triplet{
	
	int sum;
	int maxValue;
	int minValue;
	
	Triplet(int sum, int maxValue, int minValue){
		
		this.sum=sum;
		this.maxValue=maxValue;
		this.minValue=minValue;
	}
}


public class Find_SumMaxMInInArray {
    
	public static  Triplet getSumMaxMin(int [] arr) {
		
		int sum=0;
		int maxValue= Integer.MIN_VALUE;
		int minValue= Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i];
			maxValue= Math.max(maxValue, arr[i]);
			minValue= Math.min(minValue, arr[i]);		
		}
		
		 Triplet obj= new Triplet(sum, maxValue, minValue);  
		 return obj;
	}
	
public static int [] getSumMaxMin2(int [] arr) {
		
		int sum=0;
		int maxValue= Integer.MIN_VALUE;
		int minValue= Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i];
			maxValue= Math.max(maxValue, arr[i]);
			minValue= Math.min(minValue, arr[i]);		
		}
		
		int [] ans= new int[3];
		ans[0]=sum;
		ans[1]=maxValue;
		ans[2]=minValue;
		
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int [] arr= {10,3,2,1,5,6};
		Triplet obj=getSumMaxMin(arr);
		
//		for(int i=0;i<ans.length;i++) {
//			System.out.println(ans[i]);
//		}
		
		System.out.println(obj.sum);
		System.out.println(obj.maxValue);
		System.out.println(obj.minValue);
		
		 
		
	}

}
