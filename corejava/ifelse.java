package corejava;

import java.util.Scanner;

public class ifelse {
	
	

		public static void main(String[] args) {
			int a,b,c;
			Scanner sc =new Scanner(System.in);
			System.out.print("enter valueof a");
			a=sc.nextInt();
			
			System.out.print("enter valueof b");
			b=sc.nextInt();
			
			System.out.print("enter valueof c");
			c=sc.nextInt();
			
	 if(a>b) {
		 if(a>c)
		 System.out.println("a is greater ");
		 else
	     System.out.println("c is greater");
		 }
	 else {
		 if(b>c)
			 System.out.println("b is greater");
		 else
			 System.out.println("c is greater");
	 }
  }
}


