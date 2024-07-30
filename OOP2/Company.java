package OOP2;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Manager Rohit= new Manager();
      Software Shivam = new Software("Shivam");
      Analyst Ankit= new Analyst("Ankit");
      
      Rohit.addEmployee(Shivam);
      Rohit.addEmployee(Ankit);
      
      
	}

}
