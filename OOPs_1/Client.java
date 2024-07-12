package OOPs_1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//          Car Maruti= new Car();
//           Maruti.Speed=30;
//           Maruti.fuelcapacity=35;
//           Car BMW= new Car();
//           BMW.Speed=150;
//           BMW.fuelcapacity=50;
//          
//          System.out.println("Maruti fuel Capacity "+ Maruti.fuelcapacity);
//          System.out.println("Maruti speed "+Maruti.Speed);
//          
//          System.out.println("BMW fuel Capacity "+BMW.fuelcapacity);
//          System.out.println("BMW speed "+BMW.Speed);
//          
//          BMW.IncSpeed();
//          Maruti.IncSpeed();
//          System.out.println("BMW speed "+BMW.Speed);
//          System.out.println("Maruti speed "+Maruti.Speed);
	
//	   Car Maruti = new Car( 30, 4);
	   Car Maruti = new Car(30,4,56);
	   System.out.println(Maruti);
	   System.out.println("  ..................  ");
	   Car BMW= new Car(3,3,3);
	   System.out.println(BMW);
	   System.out.println("Maruti Speed is "+ Maruti.Speed);
//	   System.out.println("Maruti have "+ Maruti.seater);
//	   System.out.println("Maruti have "+ Maruti.fuelcapacity);
	   BMW.IncSpeed();
	   System.out.println("Maruti Speed is "+ Maruti.Speed);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  
	}

}
