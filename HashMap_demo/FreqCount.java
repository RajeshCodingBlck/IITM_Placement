package HashMap_demo;

import java.util.*;

public class FreqCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,1,2,2,3,4,3,1,2,3};
       HashMap<Integer, Integer> m= new HashMap();
       
       for( int val  : arr) {
    	   
    	   if(m.containsKey(val)) {
    		   
    		   int old_fre= m.get(val);
    		   m.put(val, old_fre+1);
    		   
    	   }else {
    		   
    		   m.put(val, 1);
    	   }
       }
       
       for( Integer key  : m.keySet()) {
    	   System.out.println(key+ "-> "+ m.get(key));
       }
       
	}

}
