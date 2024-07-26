package HashMap_demo;

import java.util.HashMap;
import java.util.HashSet;

public class InbuitHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		       key, Value
//       HashMap<String, Integer> m= new HashMap();
//       
//       // Student -> marks
//       
//       // add the {Key , value}
//       m.put("Mohan", 45);
//       m.put("Sohan", 60);
//       
//       m.put("Sohan", 70);
//       //  Read any Value
//       System.out.println(m);
//       
//       // update
//       
//       
//       // remove
//       //m.remove("Sohan");
//       System.out.println(m.size());
//       
//       System.out.println(m.containsKey("Mohani"));
       
//		       key, Integer
		HashMap<String, Integer> m= new HashMap();
		
		HashSet<String> hs= new HashSet();
		m.put("Mohan", 45);
		m.put("Rahul", 60);
		
		m.put("Aman", 30);
		
		System.out.println(m);
		
		System.out.println(m.get("Aman"));
		
		// check
		System.out.println(m.containsKey("Raj"));
		
		
		//update
		m.put("Aman", 60);
		System.out.println(m);
		
		for( String str : m.keySet()) {
			System.out.println(str+ " ,"+ m.get(str));
		}
		
		
       
       
       
       
       
       
       
	}

}
