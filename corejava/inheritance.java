package corejava;
import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

	class A{
		int a;
		Scanner sc=new Scanner(System.in);
		
		 void getA() {
		 System.out.println("enter value of a ");
		 a=sc.nextInt();
		 }
			void putA() { 
			System.out.println("value of a is " +a);
		}
	}
	class B extends A{
		
		int b;
		Scanner sc=new Scanner(System.in);
		void getB() {
			System.out.println("it is a base class and put value of b ");
		   b=sc.nextInt();
		}
	    void putB() {
	    	System.out.println("value of b is " +b);
	    }
		
	}
       public class inheritance {

		public static void main(String[] args) {
			B b1= new B();
			b1.getB();
			b1.getA();
			b1.putB();
	        b1.putA();
		}

	}


