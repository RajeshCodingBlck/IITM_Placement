package OOPs_1;

public class Car {
   
	int Speed;
	int seater;
	int fuelcapacity;
	String color;
	
	// Default Constructor 
	Car(){}
	
	// Parametric Constructor
	Car(int val1, int val2){
		
		Speed= val1;
		seater=val2;
	}
	
	Car(int val1, int val2, int val3, String val4){
		
		Speed=val1;
		seater=val2;
		fuelcapacity=val3;
		color= val4;
	}
	
      Car(int val1, int val2, String val3 ,int val4){
		
		Speed=val1;
		seater=val2;
		fuelcapacity=val4;
		color= val3;
	}
      
      Car(int Speed, int seater, int fuelcapacity){
    	  
    	  //System.out.println(this);
    	  this.Speed=Speed;
    	  this.seater=seater;
    	  this.fuelcapacity=fuelcapacity;
      }
	
	
	
	void IncSpeed() {
		System.out.println(this);
		Speed++;
	}
	void DecSpedd() {
		Speed--;
	}
}
