package Encapsulation;

public class Account {

	 public String AccountHolder;
	public int AccountNumber;
	private int Balance;
	private int pinNumber;
	 Account(String AccountHolder, int Balance, 
			 int pinNumber, int AccountNumber){
		 
		 this.AccountHolder=AccountHolder;
		 this.Balance=Balance;
		 this.pinNumber= pinNumber;
		 this.AccountNumber= AccountNumber;
	 }
	 
	 public void getter(int inputPin) {
		
		  if(inputPin== pinNumber) {
			  System.out.println(Balance);
		  }else {
			  System.out.println("Chal Nikal");
		  }
	 }
	 
	 public void set(int InputPin,int money) {
		 
		 if(money>0 && InputPin== pinNumber) {
			 Balance+=money;
		 }else {
			 System.out.println("Kuch Galat he .. ");
		 }
	 }
	 
	 	 
}
