package MyLinkedList;

import java.util.*;

public class Inbuit_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<Integer> ls= new LinkedList();
//     
//     System.out.println(ls);
//     ls.addFirst(34);
//     System.out.println(ls);
//     ls.addFirst(20);
//     ls.addLast(56);
//     System.out.println(ls);
//     
//     ls.removeFirst();
//     System.out.println(ls);
//     
//     ls.removeLast();
//     System.out.println(ls);
//        //  index , value
//     ls.add( 0,      12);
//     ls.add(1,30);
//     System.out.println(ls);
//     
//     ls.remove(1);
//     System.out.println(ls);
     
     ls.addLast(1);
     ls.addLast(2);
     ls.addLast(3);
     ls.addLast(4);
     ls.addLast(5);
     
     for(int i=0; i<ls.size();i++) {
    	 
    	 System.out.println(ls.get(i));
     }
     
     for( Integer val : ls) {
    	 System.out.println(val);
     }
     
     
     
     
	}

}
