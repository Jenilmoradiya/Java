package corejava;

interface intf1{
	
	void a1();
}

interface intf2{
	
	void a2();
}


public class interfaceDemo  implements intf1,intf2{
	
	public void a1() {
		 System.out.println("It is an example of interface.");
	 }
    public void a2() {
    	  System.out.println("It is also and example of multiple inheritance.");
    	  
      }
	public static void main(String[] args) {
		interfaceDemo f1=new interfaceDemo();
		f1.a1();
		f1.a2();

	}

}
