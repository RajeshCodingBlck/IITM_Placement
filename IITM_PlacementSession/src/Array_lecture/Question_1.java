package Array_lecture;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr=new int [6];
      
      int temp=10; 
      for(int i=0;i<6;i++) {
    	  //arr[i]= 10*(i+1);
    	  arr[i]=temp;
    	  temp=temp+10;
      }
      for(int i=0;i<6;i++) {
    	  System.out.print(arr[i]+" ");
      }
      
      
	}

}
