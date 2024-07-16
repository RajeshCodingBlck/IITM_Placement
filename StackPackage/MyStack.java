package StackPackage;

public class MyStack {

     // State
	private int [] arr;    //Every Stack has a Array (Composite Has a relation)
	private int top;      // Represent Index of Top Element
	 
	 MyStack(int size){
		 arr= new int[size];
		 top=-1;
	 }
	 
	
	  // Behaviour
	 public void push(int val) throws Exception {
		 
		 if(top== arr.length-1) {
//			 System.out.println("Stack is Overflow");
			throw   new Exception(" My Stack is Overflow");
			 
		 }
		 top++;
		 arr[top]=val;
	 }
	 
	 
	 public  void pop() {
		 
		 if(top==-1) {
			 System.out.println("Stack is Empty");
			 return;
		 }
		 
		 top--;
	 }
	 
	 public int peek() {
		 
		 if(top==-1) {
			 System.out.println("Stack is Empty");
			 return -1;
		 }
		 
		 return arr[top];
	 }
	 
	 public int size() {
		 
		 return top+1;
	 }
	 
	 public boolean isEmpty() {
		 if(top==-1) {
			 return true;
		 }else {
			 return false;
		 }
	 }
	 
	 public boolean isFull() {
		 if(top== arr.length-1) {
			 return true;
		 }
		 return false;
	 }
	 
	 @Override
	 public String toString() {
		 
		 String ans="";
		 for(int i=0; i<=top;i++) {
			 ans+= arr[i];
			 ans+=" , ";
		 }
		 return ans;
	 }
	 

}
