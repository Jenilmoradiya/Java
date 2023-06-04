package corejava;

interface maths{
    	
	static void math() {
	 System.out.println("It was easy to understand.");	
	 
	}
}

interface science{
	
	static void science1() {
		 System.out.println("It was hard to understand.");	
	}
}
interface computer{
	
	void comp();
}

public class InterfaceWithStatic implements maths,science,computer{
        
	public void comp() {
		System.out.println("Right now i am studying computer");
	}
	
	public static void main(String[] args) {
		InterfaceWithStatic i=new InterfaceWithStatic();
		maths.math();
		i.comp();
		science.science1();

	}

}
