package OOP2;

import java.util.ArrayList;

public class Manager {

//	 ArrayList<Software> software_arr;
//	 ArrayList<Analyst> analyst_arr;
	
	ArrayList<Employee> arr;
	 
	 Manager(){
		arr= new ArrayList();
	 }
	 
	 public  void addEmployee(Employee s) {
       
		 s.Introduction();
		 arr.add(s);
	 }
	 
	 
	 
	 
}
