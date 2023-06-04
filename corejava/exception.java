package corejava;

import java.util.Scanner;

public class exception {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int a,b,c;
		try {
		System.out.println("Enter value of a =");
        a=sc.nextInt();
        System.out.println("Enter value of b =");
        b=sc.nextInt();
        c=a/b;
        System.out.println("Division is ="+c);
	   } catch(Exception e) {
		   
		   System.out.println("Exception detected " +e);
	   }

	}
}
