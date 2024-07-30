package MyTree_pkg;

import java.util.LinkedList;
import java.util.Scanner;

public class Tree {
	
	TreeNode root;
	Scanner s= new Scanner(System.in);
	Tree(){
//		root = Build();
		root=Build_usingBFS();
	}

	private TreeNode Build_usingBFS() {
		// TODO Auto-generated method stub
		LinkedList<TreeNode> q= new LinkedList();
		Scanner s= new Scanner(System.in);
		int data= s.nextInt();
		TreeNode root= new TreeNode(data);
		q.add(root);
		
		while(q.size()>0) {
			
			// remove the front Node 
			TreeNode rn= q.removeFirst();
              
			// work
			System.out.println("Enter the Left child data of "+ rn.data);
			int data_forLeft= s.nextInt();
			if(data_forLeft !=-1) {
				
				TreeNode leftChild= new TreeNode(data_forLeft);
				rn.left =leftChild;
				// add the Left child
				q.addLast(leftChild);
			}
			
			System.out.println("Enter the right child data of "+ rn.data);
			int data_forRight= s.nextInt();
			if(data_forRight !=-1) {
				
				TreeNode rightChild= new TreeNode(data_forRight);
				rn.right =rightChild;
				// add the right child
				q.addLast(rightChild);
			}
			
			
		}
		
		return root;
	}

	private TreeNode Build() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the data");
		
		int data= s.nextInt();
		
		if(data==-1) {
			return null;
		}
		
		TreeNode root= new TreeNode(data);
		System.out.println("Enter the left child data of  "+ data);
		 root.left= Build();
		 System.out.println("Enter the right child data of  "+ data);
		 root.right= Build();
		 
		 return root;
		
	}

}
