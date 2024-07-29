package MyTree_pkg;

import java.util.Scanner;

public class Tree {
	
	TreeNode root;
	Scanner s= new Scanner(System.in);
	Tree(){
		root = Build();
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
