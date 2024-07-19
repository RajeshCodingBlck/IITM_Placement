package DynamicStackPackage;

import StackPackage.*;
public class DynamicStack  extends MyStack{
     
	
	 DynamicStack(int size){
		 super(size);
	 }
	 
	 @Override
	 public void push(int val) throws Exception{
		 
		 if(top == arr.length-1 ) {
			 
			 int [] old_arr=arr; 
			 arr=  new int[old_arr.length*2];
			 
			 for(int i=0; i<old_arr.length;i++) {
				 arr[i]=old_arr[i];
			 }
			 
		 }
		  super.push(val);
		 
	 }
}
