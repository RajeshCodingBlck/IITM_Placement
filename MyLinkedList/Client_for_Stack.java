package MyLinkedList;

public class Client_for_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyStack st= new MyStack();
       
       st.push(23);
       st.push(56);
       st.push(70);
       
       System.out.println(st.peek());
       
       //st.pop();
       System.out.println(st.peek());
       
       System.out.println(st.size());
       
       
	}

}
