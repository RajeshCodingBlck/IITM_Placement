package HashMap_demo;

import java.util.HashMap;

public class InbuitHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		       key, Value
       HashMap<String, Integer> m= new HashMap();
       
       // Student -> marks
       
       // add the {Key , value}
       m.put("Mohan", 45);
       m.put("Sohan", 60);
       
       m.put("Sohan", 70);
       //  Read any Value
       System.out.println(m);
       
       // update
       
       
       // remove
       //m.remove("Sohan");
       System.out.println(m.size());
       
       System.out.println(m.containsKey("Mohani"));
       
       
       
       
       
       
       
       
	}

}
