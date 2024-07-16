package StackPackage;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
       MyStack st= new MyStack(5);
       
       st.push(45);
       st.push(56);
       st.push(60);
       st.push(70);
       st.push(80);
       System.out.println(st.peek());
       System.out.println(st);
       
       
       
       
       
       
       
       
//       st.push(60);
//       st.push(70);
//       st.push(80);
//       st.push(90);
//       st.pop();
//       System.out.println(st.peek());
//       int [] arr= new int[5];
//       System.out.println(arr[5]);
       
	}

}
