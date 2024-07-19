package DynamicStackPackage;

public class Client_forDynamicStack {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
     DynamicStack st= new DynamicStack(5);
     
      st.push(34);
      st.push(45);
      st.push(60);
      st.push(70);
      st.push(80);
      st.push(100);
      System.out.println(st.peek());
     
	}

}
