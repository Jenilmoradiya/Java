package corejava;

import java.util.Scanner;

public class exception1 {
      public static void exp() {
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	    
		System.out.println("Enter value of a :");
		a=sc.nextInt();
		
		System.out.println("Enter value of a :");
		b=sc.nextInt();
		c=a/b;
		System.out.println("Division is :" +c );
		try {
		if(c>0) {
			System.out.println("Value is :");
		}
		else {
			throw new ArithmeticException();
		}
		}catch   (ArithmeticException e) {
			System.out.println("Enter the positive value");
			exp();
			 
		}
	}
      
	
	public static void main(String[] args) {
    exp();
     

	}

}
