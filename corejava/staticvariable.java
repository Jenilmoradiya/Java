package corejava;

import java.util.Scanner;

public class staticvariable {

	static int a;
	
	Scanner sc=new Scanner(System.in);
	
	void add() {
		System.out.println("Enter value of a");
		a=sc.nextInt();
	}
	void get() {
		
		System.out.println("A =" +a);	
	}
	
	
	public static void main(String[] args) {
		staticvariable s1=new staticvariable();
		staticvariable s2=new staticvariable();
		staticvariable s3=new staticvariable();

		s1.add();
		s2.add();
		s3.add();
		
		s1.get();
		s2.get();
		s3.get();

	}

}
