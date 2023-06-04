package corejava;
import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

class first{
	int a;
	Scanner sc=new Scanner(System.in);
	
	 void getA() {
	 System.out.println("it is derived class and enter value of a ");
	 a=sc.nextInt();
	 }
		void putA() { 
		System.out.println("value of a is " +a);
	}
}
class second extends first{
	
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
class third extends second{
	
	int c;
	Scanner sc=new Scanner(System.in);
	void getC() {
		System.out.println("it is a base class and put value of c ");
	   c=sc.nextInt();
	}
    void putC() {
    	System.out.println("value of c is " +c);
    }
	
}



public class inheritancemultilevel {

	public static void main(String[] args) {
		second b1= new second();
		third c1=new third();
		b1.getA();
		b1.getB();
		c1.getC();
		b1.putA();
		b1.putB();
		c1.putC();
       
	}

}


