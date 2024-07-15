package Encapsulation;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Account client1= 
   new Account("Mohan", 0 ,1234, 1111);
      
//      System.out.println(client1.getter());
//      client1.set(12);
//      System.out.println(client1.getter());
//      client1.set(-100);
//      System.out.println(client1.getter());
      client1.set(1234, 100);
      client1.getter(123);
      client1.set(12, 100);
      client1.getter(1234);
	}

}
