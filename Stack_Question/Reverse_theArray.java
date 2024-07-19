package Stack_Question;

import java.util.Stack;

public class Reverse_theArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,4,5,6,7};
      
      Stack<Integer> st= new Stack();
      
      for(int i=0; i<arr.length;i++) {
    	  st.push(arr[i]);
      }
      
      while(st.size()>0) {
    	  System.out.println(st.pop());
      }
      
      
	}

}
