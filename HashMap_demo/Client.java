package HashMap_demo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		MyHashMap m= new MyHashMap();
		m.put("Mohan", 45);
		m.put("Sohan", 56);
		m.put("Rohan", 78);
		
		System.out.println(m.get("Sohan"));
		System.out.println(m.containsKey("Sahil"));
		m.put("Sohan", 100);
		System.out.println(m.get("Sohan"));
		System.out.println(m);
		
		
		
	}

}
