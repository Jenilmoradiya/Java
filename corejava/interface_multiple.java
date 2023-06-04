package corejava;

import java.util.Scanner;

interface AA{
	public void runn1();
}

interface BB{
	public void run1();
	
}
class CC implements AA ,BB{
	
	public  void runn1() {
	      String s="Hello to the world of interface and its class name is AA";
	      
	      System.out.println(s);
	 }
	
	
	public void run1() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of a:");
		int a=sc.nextInt();
		System.out.println("Enter value of b:");
		int b=sc.nextInt();
		System.out.println(a*b);
	}
}

public class interface_multiple {

	public static void main(String[] args) {

     CC c=new CC();
     c.runn1();
     c.run1();
	}

}
