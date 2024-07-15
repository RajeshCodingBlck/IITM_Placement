package Modifier_demo_2;

import Modifier_demo.*;
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Access_demo_class obj1= new Access_demo_class();
		 
		 Access_demo_class obj2= new Access_demo_class();
	        //System.out.println(obj.val); Error due to val is Private in Nature
	     System.out.println(obj1.val3);
	      // obj.fun();  // fun is default in Package (Access_modifer_demo)
	     obj1.val3++;
	     System.out.println(obj2.val3); 
	     
	     Access_demo_class.val3++;
	     System.out.println(obj2.val3);
	     
	     obj1.fun();
	       
	}

}
