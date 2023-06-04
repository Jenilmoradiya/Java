package corejava;

abstract class A2{
	
	abstract void get();
}

class B2 extends A2{
	
	void get(){
		System.out.println("It was an example of abstract method");
	}
}


public class abstraction {	
	public static void main(String[] args) {
		B2 b1=new B2();
		b1.get();

	}

}
