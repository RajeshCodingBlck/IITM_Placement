package Modifier_demo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Access_demo_class obj= new Access_demo_class();
        //System.out.println(obj.val); Error due to val is Private in Nature
        System.out.println(obj.val2);
        obj.fun1();
	}

}
