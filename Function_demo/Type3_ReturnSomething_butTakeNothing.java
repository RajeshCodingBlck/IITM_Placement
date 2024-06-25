package Function_demo;

public class Type3_ReturnSomething_butTakeNothing {

	public static int add() {
		System.out.println("Add Start");
		int a=12;
		int b=13;
		int sum=a+b;
		System.out.println("Add End");
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
		int sum=add();
		System.out.println(sum);
		System.out.println("Main End");
		
	}

}
