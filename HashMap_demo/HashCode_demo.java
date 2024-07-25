package HashMap_demo;

public class HashCode_demo {
   
	
	public static int hashFunction(String  str) {
		
		int hashValue= str.hashCode();
		
		int HashfunctionValue= Math.abs(hashValue)% 101;
		return HashfunctionValue;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
//		String str= "Hello";
//		
//		System.out.println(str.hashCode());
//		
//		Integer val=23;
//		System.out.println(val.hashCode());
		
		String str= "Mohan$";
		System.out.println(hashFunction(str));
		String str2="Sohan";
		System.out.println(hashFunction(str2));
		
	}

}
