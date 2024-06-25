package Array_lecture;

public class maximum_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {6,7,1,2,4,10};
      
      int overallMaxvalue= arr[0];
      
      for(int i=1;i<arr.length;i++) {
    	  
    	  if(overallMaxvalue< arr[i]) {
    		  overallMaxvalue=arr[i];
    	  }
      }
      System.out.println(overallMaxvalue);
      
	}

}
