package IITM_Test7;

public class BusTrip {
   
	public static boolean isPossible(int [] arr, int trips, 
			int time) {
		
	      int abhiTaakKitrip=0;
	      for(int i=0;i<arr.length;i++) {
	    	  
	    	  int currBusTrip= time/arr[i];
	    	  abhiTaakKitrip+=currBusTrip;
	      }
	      
	      if(abhiTaakKitrip>=trips) {
	    	  return true;
	      }else {
	    	  return false;
	      }
	}
	public static void BusTrip(int [] arr, int trips) {
		
		
		int time=1;
		
//		while(isPossible(arr, trips, time)==false) {
//			//System.out.println(time);
//			time++;
//		}
//		System.out.println(time);
		
		int low=1;
		int high= 1000;
		int   pc=0;
		while(low<=high) {
			
			int mid= low+ (high-low)/2;
			
			if(isPossible(arr, trips, mid)) {
				pc=mid;
				high=mid-1;
			}else {
				low=mid+1;
			}
			
		}
		
		System.out.println(pc);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	  int [] arr= {1,2,3};
	  int trips=5;
	  BusTrip(arr, trips);
	  
	  
	  
	}

}
